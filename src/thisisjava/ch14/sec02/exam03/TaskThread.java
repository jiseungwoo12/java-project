package thisisjava.ch14.sec02.exam03;

import thisisjava.ch13.제네릭.test.Example;

public class TaskThread {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){}
        }



    }
}
