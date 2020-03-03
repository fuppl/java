package com.example.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRootUtils {
    private static final Path ROOT = createRoot();
    private static Path createRoot() {
        // 由于字符串路径仅在创建时使用一次性，因此声明为create()方法的局部变量
        String dir = "C:/example";
        try {
            return Files.createDirectories(Path.of(dir));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Path getRoot() {
        return ROOT;
    }
}