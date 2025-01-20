package thisisjava.ch14.sec04.sleepexamp;

public class SleepExample {
    public static void main(String[] args) {

        Thread thread = new Thread(new sleepThread());
        thread.start();

    }
}
