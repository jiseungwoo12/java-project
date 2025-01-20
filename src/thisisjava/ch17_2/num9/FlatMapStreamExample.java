package thisisjava.ch17_2.num9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapStreamExample {
    public static void main(String[] args) {
        //이번에는 flatMap()메서드를 이용해본다.
        //이메서드는 하나의 요소를 복수개의 요소들로 변환한 새로운 스트림을 만든다.

        //문장스트림을 공백으로 구분하여 여러개의 요소들이있는 스트림을 만들자
        List<String> list = new ArrayList<>();
        list.add("hello wltmddn nice to meet you");
        list.add("you are best developer");

        list.stream()
                //flatMap은 Function 함수형인터페이스의값을 매개변수로 받으므로
                //Function<T,Stream<R> 은 T를 문장을 처리방법에 분리를시켜 Stream<R>로 반환시킨다.
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.print(word+","));
        System.out.println(












        );
        //문자열 숫자목록 스트림을 숫자 스트림으로 변환
        List<String> list2 = Arrays.asList("10,20,30","40,50");

        list2.stream()
                .flatMapToInt(data ->{
                  String strarr[] = data.split(",");
                  int intarr[] = new int[strarr.length];
                    for (int i = 0; i < strarr.length; i++) {
                        intarr[i] = Integer.parseInt(strarr[i].trim());
                    }
                    return Arrays.stream(intarr);
                })
                .forEach(data -> System.out.print(data+","));


    }
}
