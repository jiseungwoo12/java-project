package thisisjava.ch16_2.Test.num2;

public class Button {
    @FunctionalInterface
    public static interface ClickListner{
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
