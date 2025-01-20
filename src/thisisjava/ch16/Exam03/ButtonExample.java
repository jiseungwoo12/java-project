package thisisjava.ch16.Exam03;

public class ButtonExample {
    public static void main(String[] args) {

        //ok버튼 객체생성
        Button okbutton = new Button();

        okbutton.setClickLister(()->
                System.out.println(" ok 버튼을 클릭합니다."));

        okbutton.click();

        //Cancle 버튼생성
        Button canclebutton = new Button();
        canclebutton.setClickLister(()->
                System.out.println("취소 버튼을 클릭합니다."));
        canclebutton.click();
    }


}
