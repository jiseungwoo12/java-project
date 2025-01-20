package thisisjava.ch14.sec04.sleepexamp;

import java.awt.*;

public class sleepThread implements Runnable{


    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){}
        }

    }
}
