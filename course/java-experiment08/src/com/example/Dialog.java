package com.example;

public class Dialog {
    /**
     * 设计点击接口，确认/取消操作行为
     */
    public interface OnclickListener {
        void submit();
        void cancel();
    }
    // 属性以及仅有的getter方法
    private String title;
    private OnclickListener onclickListener;
    private String content;
    // 私有构造函数，禁止外部创建
    private Dialog(Builder builder) {
        this.title = builder.title;
        this.onclickListener = builder.onclickListener;
        this.content = builder.content;
    }

    public String getTitle() {
        return title;
    }

    public OnclickListener getOnclickListener() {
        return onclickListener;
    }

    public String getContent() {
        return content;
    }

    /**
     * 构造器
     */
    public static class Builder {
        private String title;
        private OnclickListener onclickListener;
        private String content;
        // 提供必选的构造函数
        public Builder(String title, OnclickListener onclickListener) {
            this.title = title;
            this.onclickListener = onclickListener;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setOnclickListener(OnclickListener onclickListener) {
            this.onclickListener = onclickListener;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }
        // 构造dialog对象的方法
        public Dialog build() {
            return new Dialog(this);
        }
    }
}