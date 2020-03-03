package entity;

public class Button extends View {
    private String text;
    public Button(ViewOnClickListener viewOnClickListener, String text) {
        super(viewOnClickListener);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

