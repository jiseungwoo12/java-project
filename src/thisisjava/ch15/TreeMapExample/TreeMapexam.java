package thisisjava.ch15.TreeMapExample;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapexam {
    public static void main(String[] args) {
        //TreeMap도 set과 같이 이진트리를 기반으로한 Map컬렉션이다
        //다른점은 키와값이 저장된 entry를 저장한다는점이 다르다.
        //엔트리를 저장하면 키를기준으로 자동정렬된다 낮은것 왼쪽 높은것 오른쪽 자식노드에 entry객체저장
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("apple",10);
        treeMap.put("forever",60);
        treeMap.put("description",40);
        treeMap.put("ever",50);
        treeMap.put("zoo",80);
        treeMap.put("base",20);
        treeMap.put("guess",70);
        treeMap.put("cherry",30);
        //정렬된 엔트리를 하나씩 가져오기
        //TreeMap은 iterable을 구현하지않았기때문에 for문을 사용할수없다
        //treemap의 엔트리를 set객체에다가 저장하자
        Set <Entry<String,Integer>> entrySet = treeMap.entrySet();
        for (Entry<String,Integer> e : entrySet){
            System.out.println(e.getKey() + "-"+ e.getValue());
        }
        System.out.println();
        
        //특정키에 대한값 가져오기
        //treemap은 key값으로 특정키를 판별한다
        //문자열인경우 a-z까지의 순으로 a는낮은순 z는 높은순으로 구별한다.
        //숫자의 1~100 중에 1은 낮은수 100은 높은수처럼
        Entry<String,Integer> entry = null;
        //제일낮은객체 apple
        entry = treeMap.firstEntry();
        System.out.println(entry.getKey() + "-" + entry.getValue());
        //제일높은객체  zoo
        entry = treeMap.lastEntry();
        System.out.println(entry.getKey()+"-"+entry.getValue());
        //ever앞단어
        //lowerEntry(String element)
        entry = treeMap.lowerEntry("ever");
        System.out.println(entry.getKey()+ "-"+ entry.getValue());
        //ever보다 높은단어
        entry = treeMap.higherEntry("ever");
        System.out.println(entry.getKey()+"-"+entry.getValue());

        //주어진키와 동등한 키가있으면 해당 entry를 리턴 없다면 키 바로 아래의 entry리턴
        //floorEntry()
        entry = treeMap.floorEntry("xx");  //guess리턴 x밑
        System.out.println(entry.getKey()+"-"+entry.getValue());

        //ceilingEntry 동등한키가있다면 그걸반환없다면 그 위의 엔트리리턴
        entry = treeMap.ceilingEntry("xx");  //zoo리턴
        System.out.println(entry.getKey()+"-"+entry.getValue());

        //꺼내오고 제거
        //제일낮은 entry를 꺼내오고 컬렉션에서 제거
        //pollFirstEntry()
        Entry<String,Integer> entry1 = null;
        entry1 = treeMap.pollFirstEntry();
        System.out.println(entry1.getKey()+"-"+entry1.getValue());
        
        //제일 높은 entry를 꺼내오고 컬렉션에서 제거
        Entry<String,Integer> entry2 = null;
        entry2 = treeMap.pollLastEntry();
        System.out.println(entry2.getKey()+"-"+entry2.getValue());

        //컬렉션에서 삭제되었는지 확인
        Set<Entry<String,Integer>> deleteEntry = treeMap.entrySet();
        for (Entry<String,Integer> e: deleteEntry){
            System.out.println("수정된 entry: " + e);
        }
        //이처럼 제일낮은 apple엔트리객체와 제일높은 zoo객체가 삭제되었다는것을 알수있다.

        //내림차순으로 정렬된키의 navigableSet을 리턴
        NavigableSet<String> Entrydescending = treeMap.descendingKeySet();
        //내림차순으로 정렬된 entry의 NavigableMap을 리턴
        NavigableMap<String,Integer> entrydescendingMap =  treeMap.descendingMap();
        //내림차순으로 정렬된 entry를 다시 set객체에 저장
        Set<Entry<String,Integer>> setEntrydescendingMap = entrydescendingMap.entrySet();
        for (Entry<String,Integer> e : setEntrydescendingMap) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        //이처럼 내림차순으로 변경하면 키값이알파벳순으로 정렬됨.
        //범위검색
        System.out.println("c~h사이의 단어검색");
        NavigableMap<String,Integer> rangeMap = treeMap.subMap("c",true,"h",false);
            //이번에는 for문에서 entry를 set으로바꾸고 바로출력해보자
        for (Entry<String,Integer> e : rangeMap.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());


        }

    }
}
