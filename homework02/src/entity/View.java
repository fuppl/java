package entity;

public class View {
    public interface ViewOnClickListener {
        void onClick();
    }
    private ViewOnClickListener viewOnClickListener;

    View(ViewOnClickListener viewOnClickListener) {
        this.viewOnClickListener = viewOnClickListener;
    }

    public ViewOnClickListener getViewOnClickListener() {
        return viewOnClickListener;
    }

    public void setViewOnClickListener(ViewOnClickListener viewOnClickListener) {
        this.viewOnClickListener = viewOnClickListener;
    }
}