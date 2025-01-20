package thisisjava.ch17.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("지승우");
        set.add("지종우");
        set.add("이종창");

        //외부 반복자 이용
        for (String item : set){
            System.out.println(item);
        }
        System.out.println();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }

        //내부 반복자이용
        Stream<String> stream = set.stream();
        stream.forEach((t)-> System.out.println(t));
    }
}
