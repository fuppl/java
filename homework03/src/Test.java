public class Test {
    public static void main(String[] args) {
        String path = "/courses/lecture/lecture01.pdf";
            int index=path.lastIndexOf(".");
            int f=path.indexOf("/");
        System.out.println("扩展名为"+path.substring(index+1));
        System.out.println("文件名为"+path.substring(1,f));
    }
}
