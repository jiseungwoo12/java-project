package thisisjava.ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        //스트림으로 병렬처리
        //1~50 스레드 a 51~100 스레드b에서처리한다
        //
        List<String> list = new ArrayList<>();
        list.add("지승우");
        list.add("지종우");
        list.add("지동산");
        list.add("유진실");
        list.add("유진현");

        //멀티 스트림을 만들어서 병렬적으로 처리하자
        //Stream = parallelStream 병렬스트림
        Stream<String> stream = list.parallelStream();
        stream.forEach(name-> System.out.println(name+" "+Thread.currentThread().getName()));

    }
}
