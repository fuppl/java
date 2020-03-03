package com.example;

public class Test {
    public static void main(String[] args) {
        // 封装必选的title与执行操作
        Dialog.Builder builder = new Dialog.Builder("网络异常",
                new Dialog.OnclickListener() {
                    @Override
                    public void submit() {
                        System.out.println("点击确认");
                    }

                    @Override
                    public void cancel() {
                        System.out.println("点击取消");
                    }
                });
        // 封装可选的内容信息
        builder.setContent("WIFI网络无法访问，请确认网络环境");
        // 创建dialog对象
        Dialog dialog = builder.build();
        // 从dialog对象获取测试封装的信息
        System.out.println(dialog.getTitle());
    }
}