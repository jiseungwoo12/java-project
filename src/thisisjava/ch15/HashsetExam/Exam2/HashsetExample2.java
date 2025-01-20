package thisisjava.ch15.HashsetExam.Exam2;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample2 {
    public static void main(String[] args) {
        //다시한번말하지만 String같은 클래스는 equals와 hashcode가 재정의되있으므로
        //hashset에 삽입하면 동일객체로 판단해 삽입이 안되는것이다.
        //Member라는 클래스에 재정의 코드가 들어가야지만 객체의내용을 비교한다.
        Set<Member> set = new HashSet<>();
        //제네릭타입으로 Member만들어올수있는 hashset객체.
        set.add(new Member("지승우",24));
        set.add(new Member("지승우",24));
        set.add(new Member("지종우",25));
        set.add(new Member("유진실",51));
        set.add(new Member("지동산",56));
        set.add(new Member("지동산",56));

        int size=  set.size();
        System.out.println("hashset에 저장된 객체 수:" + size);

        
    }
}
