package thisisjava.ch15.MapCollection.HashtableExam;

import java.util.*;
import java.util.Set.*;

public class HashtableExample {
    public static void main(String[] args) {
        //해쉬테이블과 해쉬맵은 싱글스레드를 사용할때는 크게 차이가없고
        //오히려 해쉬맵이 싱글스레드에선 유용하다.
        //해쉬테이블은 동기화된 메소드로 구성되어있기 때문에
        //멀티스레드에서 더 유용하다

        Map <String,Integer> map = new Hashtable<>();

        //스레드 객체생성
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put("물건"+i,i);
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put("물건"+i,i);
                }
            }
        };
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        }catch (InterruptedException e){}

        Set<Map.Entry<String,Integer>> entryset = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entryset.iterator();
        while (entryIterator.hasNext()){
            Map.Entry <String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println(k + " : "+ v);

        }
        int size = map.size();
        System.out.println(size);



    }
}
