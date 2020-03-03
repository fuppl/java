package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import com.example.util.FileRootUtils;

public class IOTest {
    public static void main(String[] args) {
        String file = "from.txt";

        System.out.println("----- 创建文件 ------");
        createFile(file);

        System.out.println("-----  将字符串写入文件 -------");
        StringBuilder builder = new StringBuilder();
        // \r\n在txt文本中换行
        builder.append("白日依山尽\r\n");
        builder.append("黄河入海流\r\n");
        builder.append("欲穷千里目\r\n");
        builder.append("更上一层楼\r\n");
        writeToFile(builder.toString(), file);

        System.out.println("--------- 基于IO流复制文件 ----------");
        String toFile = "to.txt";
        copyByIO(file, toFile);

        System.out.println("---------- 删除指定文件 -------------");
        deleteFile(toFile);
    }

    // 在应用根root目录下，创建指定名称的文件
    // 如果文件已经存在，则忽略
    private static void createFile(String fileName) {
        Path p = FileRootUtils.getRoot().resolve(fileName);
        System.out.println(p);
        if (Files.exists(p)) {
            return;
        }
        try {
            Files.createFile(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提示：文件以字节操作，因此可以
     * 通过调用字符串对象中的getBytes()方法，将字符串转为字节数组
     * 再通过Files.write()方法，保存
     *
     * @param content
     * @param file
     */
    private static void writeToFile(String content, String file) {
        byte[] bytes = content.getBytes();
        Path p = FileRootUtils.getRoot().resolve(file);
        try {
            Files.write(p, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * IO不支持NIO Path接口，因此需调用path对象的toString()方法转为字符串操作
     * 打印显示循环读写循环次数
     *
     * @param sourceFile
     * @param targetFile
     */
    private static void copyByIO(String sourceFile, String targetFile) {
        Path pIn = FileRootUtils.getRoot().resolve(sourceFile);
        Path pOut = FileRootUtils.getRoot().resolve(targetFile);
        try (FileInputStream in = new FileInputStream(pIn.toString());
             FileOutputStream out = new FileOutputStream(pOut.toString())) {
            byte[] buffer = new byte[4];
            int length;
            int count = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
                count++;
            }
            System.out.println("循环次数: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     * @param file
     */
    private static void deleteFile(String file) {
        Path p = FileRootUtils.getRoot().resolve(file);
        try {
            Files.deleteIfExists(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 例如，在根路径下，创建目录及文件：experiment/exp06/12.txt
     * 文件可能包含多层目录，无法直接创建文件
     * 因此，先获取/创建文件所在目录
     * @param file
     */
    private static void createFile2(String file) {
        Path p = FileRootUtils.getRoot().resolve(file);
        try {
            Files.createDirectories(p.getParent());
            if (Files.exists(p)) {
                return;
            }
            Files.createFile(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
