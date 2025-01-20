package thisisjava.ch14.sec02;

public class MainThreadExample {
    public static void main(String[] args) {
        //메인스레드.
        System.out.println("시작");

        Thread currThread = Thread.currentThread();
        System.out.println(currThread.getName() );

        System.out.println("종료");
    }
}
