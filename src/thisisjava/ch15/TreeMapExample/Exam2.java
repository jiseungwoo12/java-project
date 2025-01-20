package thisisjava.ch15.TreeMapExample;

import java.util.*;
import java.util.Map.*;

public class Exam2 {
    public static void main(String[] args) {
        //treemap도 treeset과같은 이진트리기반 컬렉션이다.
        //다른점은 treemap에는 entry객체가 들어간다 키값으로 left right를 구분한다
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(90,"지승우");
        treeMap.put(100,"지종우");
        treeMap.put(50,"이종창");
        treeMap.put(10,"조건호");

        //treeMap은 iterable을 구현하고있지않으므로 for문에서사용불가하다
        //사용하게하려면 이처럼 Set객체에 저장해야한다
        Set<Entry<Integer,String>> set = treeMap.entrySet();
        for (Entry<Integer,String> e : set){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
        //이처럼 Treemap도 이진트리로 오름차순으로 자동정렬되어 결과값을 나타낸다.
        //내림차순으로 바꾸기부터 시작해보자
        NavigableMap<Integer,String> descendingMap = treeMap.descendingMap();
        //descendingMap을 for문으로 출력하고싶다면 set객체에 저장하면된다.
        Set<Entry<Integer,String>> setkey = descendingMap.entrySet();
        for (Entry<Integer,String> e : setkey) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
            //key만 set에저장 이말을 entry객체를 저장하는것이아닌 key만 내림차순으로 가져온다.
        NavigableSet<Integer> keydescandingset = treeMap.descendingKeySet();
        for (Integer i: keydescandingset){
            System.out.println(i);
        }
        //이친구는 set형태이므로 for문을 바로사용가능,.










    }
}
