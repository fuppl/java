import entity.Button;
import entity.View;

public class Test {
    public static void main(String[] args) {
        Button b1 = new Button(new View.ViewOnClickListener() {
            @Override
            public void onClick() {
                System.out.println("submit");
            }
        }, "提交");
        b1.getViewOnClickListener().onClick();;

        Button b2 = new Button(new View.ViewOnClickListener() {
            @Override
            public void onClick() {
                System.out.println("cancel");
            }
        }, "取消");
        b2.getViewOnClickListener().onClick();
    }

}

