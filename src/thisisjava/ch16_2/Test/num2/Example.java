package thisisjava.ch16_2.Test.num2;

public class Example {
    public static void main(String[] args) {
        Button btnOK = new Button();
        btnOK.setClickListner(()->{
            System.out.println("OK버튼을 클릭했습니다.");
        });
        btnOK.click();
        Button btnCancle = new Button();
        btnCancle.setClickListner(()->{
            System.out.println("Cancle버튼을 클릭했습니다.");
        });
        btnCancle.click();
    }
}
