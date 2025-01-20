package thisisjava.ch14.sec02.exam03;

public class 익명자식객체스레드 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();


        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException e){}
                }
            }
        };
        thread1.start();

    }
}
