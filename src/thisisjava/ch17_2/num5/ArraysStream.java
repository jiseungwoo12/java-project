package thisisjava.ch17_2.num5;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStream {
    public static void main(String[] args) {

        //String배열의 스트림
        String[] stringarr = {"지승우","지종우","지동산"};

        Stream<String> strStream = Arrays.stream(stringarr);
        strStream.forEach(str -> System.out.println(str));


        //Int배열의 스트림
        int[] intarr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intarr);
        intStream.forEach(i -> System.out.print(i+","));
    }
}
