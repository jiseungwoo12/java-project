package thisisjava.ch16_2.exam03.ButtonExam;

public class ButtonExample {
    public static void main(String[] args) {


        Button okbutton= new Button();
        okbutton.setClickListner(()->{
            System.out.println("ok 버튼을 클릭합니다.");
        });

        okbutton.click();

        Button cancleButton = new Button();
        cancleButton.setClickListner(()-> System.out.println("취소 버튼클릭")
        );
        cancleButton.click();



    }
}
