package thisisjava.ch14.sec02.exam02;

import java.awt.*;

public class BeepSoundExample {
    public static void main(String[] args) {
        //메인 스레드에서 beep음 내기
        //toolkit
        //작업 1
        Thread thread = new Thread() {
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        //작업 2
        Thread thread1 = new Thread(new Task());
        thread1.start();


    }


}
