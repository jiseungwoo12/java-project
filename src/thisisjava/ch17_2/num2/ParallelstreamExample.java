package thisisjava.ch17_2.num2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelstreamExample {
    public static void main(String[] args) {
        //이번에는 일반 스트림(한개의 스트림)
        //말고 병렬처리 스트림을 배워본다
        //병렬처리는 parallelStream()메서드를 사용한다.


        List<String> list = new ArrayList<>();

//        list.add("지승우");
//        list.add("김승우");
//        list.add("한승우");
//        list.add("염승우");
//        list.add("주승우");
        //병렬 처리를할땐 처리할내용이 많으면 많을수록 좋다.
        for (int i = 0; i < 1000; i++) {
            list.add("list :"+i);
        }


        //병렬처리 스트림만들기 parallelStream
        //병렬처리를할땐 작업관리자의 cpu의 코어개수에따라
        //지금 내컴퓨터 12개의 스트림으로 나뉘어서 작업처리를한다.
        //처리해야할 양이많을수록 병렬처리를 해주는것이 실행속도가빠르므로 좋다.
        Stream<String> stream = list.parallelStream();
        stream.forEach(t -> System.out.println(t +": "+Thread.currentThread().getName()));

    }
}
