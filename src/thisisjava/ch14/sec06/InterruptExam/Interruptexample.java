package thisisjava.ch14.sec06.InterruptExam;

public class Interruptexample {
    public static void main(String[] args) {

        Thread thread = new PrintThread();
        thread.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }


        thread.interrupt();
    }
}
