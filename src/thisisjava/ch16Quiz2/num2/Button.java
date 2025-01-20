package thisisjava.ch16Quiz2.num2;

public class Button {

    public static interface ClickListner {
        void onClick();
    }
    private ClickListner clickListner;

    public void setClickListner(ClickListner clickListner){
        this.clickListner = clickListner;
    }

    public void click(){
        clickListner.onClick();
    }

}
