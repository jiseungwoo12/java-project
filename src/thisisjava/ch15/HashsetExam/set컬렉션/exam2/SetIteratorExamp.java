package thisisjava.ch15.HashsetExam.set컬렉션.exam2;

import java.util.HashSet;
import java.util.*;
public class SetIteratorExamp {
    public static void main(String[] args) {

        Set <String> set = new HashSet<>();
        set.add("java");
        set.add("jsp");
        set.add("kotlin");
        set.add("spring");

        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            String element = i.next();
            System.out.println(element);

        }
        System.out.println();
        set.remove("jsp");
//        for (String s : set){   //for문에서 객체를 비교
//            System.out.println(s);
//            if (s.equals("java")){
//                set.remove(s);





    }
}
