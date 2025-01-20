package thisisjava.ch16_2.exam03.ButtonExam;

public class Button {
    //중첩 함수형 인터페이스 선언
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
