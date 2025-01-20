package thisisjava.ch15.MapCollection.HashMapExam;

import java.util.HashMap;
import java.util.*;
import java.util.Map.*;

public class HashMapExample02 {
    public static void main(String[] args) {
        //이번에는 Entry객체를 set객체에 담아서 리턴해보자
        Map<String, Integer> map = new HashMap<>();

        map.put("지승우",23);
        map.put("지종우",23);
        map.put("지동산",23);

        Set<Entry<String,Integer>> entryset = map.entrySet();
        Iterator<Entry<String,Integer>> entryIterator = entryset.iterator();
            while (entryIterator.hasNext()){
                Entry<String,Integer> entry = entryIterator.next();
                String k = entry.getKey();
                int v = entry.getValue();
                System.out.println(k + " "+ v);
            }
            int entrysize1 = map.size();
        System.out.println(entrysize1);

            //키로 엔트리삭제
                map.remove("지승우");
            //iterator로 값을 얻어와야함
        //Iterator는 재사용이 안됨
        //keyset으로 set객체를 만든후 사용
        //key의 정보만 담는다.

        //이렇게 remove에 key값을주고 삭제할시 key와 value값의 객체인 Entry가 삭제되는것을 알수있다.

        Set<String> keyset = map.keySet();
        Iterator<String> keyiter = keyset.iterator();
        while (keyiter.hasNext()){
            String k = keyiter.next();
            int v = map.get(k);
            System.out.println(k + " : " + v );
        }
        //총 엔트리수  사이즈3에서 2로변경 하나 remove
        int entrysize = map.size();
        System.out.println(entrysize);

//            for (String s: map){  //map은 iterator을 구현하지않아 for문사용불가능.
//                System.out.println(s);
//
//            }

        //void clear() //모든 엔트리를 삭제한다.
//        map.clear();
////        int size = map.size();
////        System.out.println(size);  //모두삭제되었으므로 0을반환




    }
}
