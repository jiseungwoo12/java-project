package thisisjava.ch16Quiz2.num2;

public class Example {
    public static void main(String[] args) {
        Button exitButton = new Button();
        exitButton.setClickListner(()-> System.out.println("나가기 버튼입니다."));
        exitButton.click();

        Button cancleButton = new Button();
        cancleButton.setClickListner(()-> System.out.println("취소 버튼입니다."));
        cancleButton.click();
    }
}
