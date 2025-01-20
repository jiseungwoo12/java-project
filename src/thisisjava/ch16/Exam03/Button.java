package thisisjava.ch16.Exam03;

public class Button {
    //중첩 인터페이스
    @FunctionalInterface
    public static interface ClickLister{
        void onClick();
    }
    private ClickLister clickLister;

    public void setClickLister(ClickLister clickLister){
        this.clickLister = clickLister;
    }

    public void click(){
        clickLister.onClick();
    }


}
