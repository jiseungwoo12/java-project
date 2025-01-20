package thisisjava.ch15.SynchronizedCollection.Exam01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {

        Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());


        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 1000; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };

        Thread thread1 = new Thread(){
            @Override
            public void run(){
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i,"내용"+i);
                }
            }
        };
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        }catch (Exception e){}

        int size = map.size();
        System.out.println("hashmap의 객체개수는?:" +size);



    }
}
