package thisisjava.ch17_2.practice.Collect;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    //Student라는 객체를 담은 리스트를 생성하고
    //리스트를 스트림으로 흐르게하고자하고
    //리스트의 성별이 남자인 부분만 리스트에 새롭게 생성하고싶다
    public static void main(String[] args) {


        List<Student> stlist = new ArrayList<>();
        stlist.add(new Student("지승우","남자",90));
        stlist.add(new Student("지종우","남자",95));
        stlist.add(new Student("김채원","여자",80));
        stlist.add(new Student("김예진","여자",85));
        //리스트를 새롭게 만드려면 반환타입이 리스트여야한다 당연한것
        List<Student> maleList = stlist.stream()
                //filter로 필터링하여 남자인 객체만 걸러낸다.
                //다시 filter에 대한 설명을 짚고 간다.
                //filter는 스트림에서 제공하는 메서드이므로 필터링 이와같이 남여를 구분하기도한다.
                //filter(Predicate <T> predicate)는
                //Predicate는 함수형인터페이스 이므로 test(T t)라는 메서드를 구현하도록하고있다
                //이메서드는 boolean값으로 리턴되므로 이 식이 같을시 true리턴 아니면 false를 리턴한다.
                //따라서 남자인 객체만 추린다면 equals메서드를 이용해 equals("남")이렇게 객체를 필터링
                //맞으면 true가 리턴되어 그 객체는 stream에 흐르도록저장된다
                .filter(s->s.getSex().startsWith("남"))
                //자바 16버전이후부터 이렇게 간략하게 Stream인터페이스에서 기능을 제공한다
                //하지만 나는 정석으로 해보겟다
                .toList();
                //Stream클래스가 제공하는 collect메서드
                //collect메서드를 사용하려면 collect(Collector<T,A,R> collector)
                //Collector라는 인터페이스는 함수형인터페이스가 아니므로
                //Collectors의 정적메서드인 toList,toSet, toMap등을 이용해서 매개변수의 입력란을채운다
                //이러한 메서드의 기능은 list반환 set반환 map반환등의 역할을 한다,.
//                .collect(Collectors.toList());
                //이처럼 collect는 최종처리결과를 위한 메서드이기도 하므로
                //이렇게 마무리지을수있다.
        
                //스트림으로 하나씩 출력하기 Stream의 forEach()메서드
                maleList.stream()
                        .forEach(s-> System.out.println(s.getName()));
    }
}
