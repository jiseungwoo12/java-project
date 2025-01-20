package thisisjava.ch17_2.num8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample2 {
    public static void main(String[] args) {
        //이번에는 정수를 실수스트림으로 바꾸고
        //박싱을하여 래퍼스트림으로 변경하여보겠다.

        int[] intarr  = {1,2,3,4,5};
        //asDoubleStream 정수스트림을 실수스트림으로 변경하여 새로운 스트림을 생성한다.
        IntStream intStream = Arrays.stream(intarr);
        intStream
                .asDoubleStream()
                .forEach(i -> System.out.println(i));
        
        //이번엔 intStream을 Integer객체의 스트림으로 변경해본다.
        //스트림객체는 재사용이 불가하기때문에 다시 값을 넣어 흐르게한다.
        intStream = Arrays.stream(intarr);
        intStream.boxed()
                //래퍼클래스는 모두 toString을 정의하고잇으므로 객체만 출력값에 넣어도 출력된다.
                .forEach(i -> System.out.println(i));
    }
}
