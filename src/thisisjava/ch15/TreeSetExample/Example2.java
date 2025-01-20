package thisisjava.ch15.TreeSetExample;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        //treeSet 다시공부
        //treeSet은 이진트리를 기반으로한 컬렉션이다.
        //예를들어 Integer객체를 treeset객체에 저장한다면
        //루프노드 부모노드 자식노드 순으로 각노드의 최대2개의 노드를 연결할수있는구조
        //부모노드로부터 left right가지가있다면 left는 작은수 right는 큰수를 저장한다.
        //다른 인터페이스는 Set인터페이스객체에 객체정보를저장하지만
        //TreeSet만의 메서드를 사용하기위해 이렇게정의한다
        //또한 제네릭타입으로 treeSet안에 들어갈수있는 객체를 지정해야한다
        TreeSet<Integer> treeSet = new TreeSet<>();
        //TreeSet은 set과같이 객체를 추가할땐 add메서드를 사용한다.
        //Set의기능을 전부사용하면서 treeSet기능을 사용한다는의미
        //다형성  제네릭타입으로 지정된객체만 들어올수있다.
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(90);

        //treeSet은 iterable인터페이스를 구현하고있기때문에 for문으로도 읽고쓰기가능하다.
        for (Integer i: treeSet){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        //이처럼 treeSet은 부모노드로부터 작은수 left 높은수 right형식으로 저장되기때문에
        //꺼낼때도 오름차순 낮은순->높은순으로 꺼내지게된다.

        //이번엔 TreeSet의 메서드를 사용해보자
        //제일 낮은수
        System.out.println("제일 낮은수: "+ treeSet.first());
        //제일 높은수
        System.out.println("제일 높은수: "+treeSet.last());
        //90 보다 한단계낮은수
        System.out.println("90보다 낮은수:"+treeSet.lower(90));
        //90보다 한단계높은수
        System.out.println("90보다 한단계높은수: "+treeSet.higher(90));
        //90점이거나 바로아래점수

        //내림차순정렬
        NavigableSet<Integer> descendingset = treeSet.descendingSet();
        for (int i : descendingset){
            System.out.print(i+" ");
        }
        System.out.println();

        //범위검색 80<=
        NavigableSet<Integer> rangeset = treeSet.tailSet(80,true);
        for (int i : rangeset){
            System.out.print(i+" ");
        }
        System.out.println();
        // 80<= ? < 100
        NavigableSet<Integer> rangeset2 = treeSet.subSet(80,true,100,false);
        for (int i : rangeset2){
            System.out.print(i+" ");
        }



















    }
}
