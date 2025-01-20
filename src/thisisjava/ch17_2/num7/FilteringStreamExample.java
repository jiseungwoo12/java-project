package thisisjava.ch17_2.num7;

import java.util.ArrayList;
import java.util.List;

public class FilteringStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("지승우");list.add("지종우");list.add("지동산");list.add("유진실");
        list.add("지승우");

        //스트림으로 중복을 제거하여 출력하는 코드 distinct()메서드
        //distinct는 매개값을 조사한후 boolean을 리턴한다 true가될시 중복으로 인정되어 삭제
        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        //중복을 제거하고 지씨인 사람만 출력
        //filter(Predicate <T>)를 사용 왜냐 객체기때문에 string
        //int일딴 (IntPredicate t)를 사용하면된다
        //반환타입도 intStream임으로 주의하자
        //롱이나 더블도 마찬가지이다 리턴타입과 매개변수타입이 동일하다 ^&
        //list의 객체 string을 흘러가게한다.
        list.stream()
                //list의 중복된 요소를 제거한다.
                .distinct()
                //필터링으로 "지"로시작하는 문자만 골라낸다 필터링
                //filter메서드와 distinct메서드는 리턴타입이 Stream
                //filter메서드도 마찬가지로 람다식으로 조건을 부여한후
                //그 조건이 true가될시 필터링되어 스트림에 그것만 흘러가게한다.
                .filter(n -> n.startsWith("지"))
                .forEach(n -> System.out.println(n));

        //filter()의모든 매개변수는 함수형 인터페이스이므로 람다식을 작성해주어야한다




    }
}
