package thisisjava.ch14.sec02.exam03;

import java.awt.*;

public class Task extends Thread{
    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500); }
            catch (InterruptedException e){
            }
        }
    }
}
