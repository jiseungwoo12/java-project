package thisisjava.ch17.sec03;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample2 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("지승우",100),
                new Student("지종우",90),
                new Student("지동산",80)
        );

        //이번에는 메서드 체이닝 기법을 활용하여보겠다
        //점수 int형의 최종결과는 평균합계이므로
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println(avg);

        //스트림 파이프라인으로 구성할때 주의할점은 파이프라인의 맨 끝에는 항상
        //최종결과처리부분이있어야한다 즉 .average.getAsDouble()이 있어야한다
        //최종 처리가없다면 오리지널및중간스트림은 작동하지않는다.

        //이번에는 학생의 이름만 출력하고싶다
        list.stream()
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));

    }
}
