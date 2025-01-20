package thisisjava.ch15.SynchronizedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class syschronizedCollections {
    public static void main(String[] args) {
        //이번시간에는 동기화된 컬렉션을알아보자
        //ArrayList와 vector의 차이점을 배웠듯이
        //vector는 멀티스레드환경에 적합한 synchronized메서드를 보유하고있다.

        //ArrayList나 hashmap hashset treeset treemap등 싱글스레드에서만 사용이 적합한
        //컬렉션을 동기화된컬렉션으로 바꿔주는 작업을한다.

        List<String> arrayList = Collections.synchronizedList(new ArrayList<>());
        List<String> linkedlist = Collections.synchronizedList(new LinkedList<>());
        //이와같이 멀티스레드에 적합하게 동기화된 컬렉션으로 List객체에 저장한다.
    }
}
