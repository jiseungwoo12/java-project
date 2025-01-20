package thisisjava.ch17_2.num3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {

        //메소드체이닝 기법으로 학생<Student> 점수의 평균값을 구하고 출력하시오
        //1 수정이불가한 리스트생성 3명의 학생값 집어넣기
        List<Student> list = List.of(
                new Student("지승우",90),
                new Student("지종우",80),
                new Student("지중우",75)
        );
        //2.
        double scoreavg = list.stream()//student객체가 흘러가는 스트림
                .mapToInt(student -> student.getScore())//int형 score으로 흘러가는스트림
                .average()  //score점수값을 평균으로 구함
                .getAsDouble(); //평균score값을 double값에 저장하기위해 형변환메소드사용

        System.out.println("평균점수 : "+ scoreavg);

        //이번에는 학생의 이름만 출력하고싶다

                list.stream()
                .map(student -> student.getName())
                .forEach(stn -> System.out.println(stn));

    }
}
