package thisisjava.ch15.HashsetExam.set컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorExam {
    public static void main(String[] args) {
        //set컬렉션은 인덱스로 객체를 검색하여 가져오는 메서드가없다.
        //대신 객체를 하나씩 반복해서 가져와야한다.
        //여기에는 두가지 방법이있다.
        //1번 for문 이용하기.
        Set <String> set = new HashSet<>();
        //순서대로 저장되는것이아님. 집합과같음.
        set.add("지승우");
        set.add("지종우");
        set.add("지동산");
//        set.add("지동산");  //같은 값 저장불가능.

//        for (String s : set){  //이렇게 향상된 for문으로하거나
//            System.out.println(s);
//        }
//        for (int i = 0; i < set.size(); i++) {  //일반for문은 불가 get이나 가져올수있는메서드없음.
//            System.out.println();
//        }
        //2번 set객체의 iterator메서드 사용
        //Iterator객체에 set의 정보값을 읽어오다.
        Iterator<String> iterator = set.iterator();
        //for문으로 다읽기
        for (int i = 0; i < set.size(); i++) {
            if (iterator.hasNext()){
                System.out.println(iterator.next());

            }
        }
        //while문으로 읽기
        while (iterator.hasNext()){  //읽어올값이 있으면 true로 반복 없으면 false로 끝
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("지종우")){
                //가져온객체를 컬렉션에서 제거.
                iterator.remove();
            }
        }
        System.out.println("--------");
        set.remove("지동산");
        for (String s: set){
            System.out.println(s);
        }


    }
}
