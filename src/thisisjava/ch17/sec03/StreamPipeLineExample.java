package thisisjava.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        //스트림은 하나 이상 연결될 수 있다.
        //컬렉션,배열 -> 오리지널스트림 -> 필터링중간 -> 매핑중간 -> 최종결과
        //이것을 스트림 파이프라인이라한다
        //오리지널스트림과 최종결과사이 중간스트림들은 최종처리를 위해
        //요소를 걸러내거나(필터링) 요소를 변환(매핑), 정렬하는 작업을 수행한다.
        //최종처리는 중간처리에서 정제된 요소를 반복하거나 집계(카운팅,평균,총합)을 계산한다.

        //고정된 크기로 List객체생성하기 Arrays.aslist
        List<Student> list = Arrays.asList(
            new Student("지승우",100),
            new Student("지종우",90),
            new Student("지동산",80)
        );

        //스트림객체로 리스트를 흘러가게 설정
        Stream<Student> studentStream = list.stream();
        //정수 score만 매핑하여 intstream에 저장
        //어떤 객체를 어떤 int값으로 매핑할것인지는 람다식으로 제공해야한다.
        //student -> student.getScore()은 student객체를 getScore()값으로 매핑한다.

        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        //IntStream은 최종처리를 위해 다양한 메소드를 제공하는데
        //average는 요소들의 평균합계를 구한다.

        //최종 처리 평균계산
        double avg = scoreStream.average().getAsDouble();
        System.out.println(avg);

        


    }
}
