package thisisjava.ch16_2.Test.num1;

public class Example {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            for (int i = 0; i < 3; i++) {
                System.out.println("작업 쓰레드가 실행됩니다.");
            }
        });
        thread.start();
    }
}
