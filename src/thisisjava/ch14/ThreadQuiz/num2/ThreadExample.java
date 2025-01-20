package thisisjava.ch14.ThreadQuiz.num2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Runnable musicRunnable = new MusicRunnable();
        Thread thread2 = new Thread(musicRunnable);
        thread2.start();
    }
}
