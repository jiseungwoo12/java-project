package thisisjava.ch17_2.Quiz.num1;

import java.util.Arrays;
import java.util.List;


public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book"
        ,"Lambda Expression","Java8 supports lambda expressions");

        //java라는 단어가 포함된 문자열만 필터링해서출력하기
        //대소문자 구분없이 toLowerCase().contains(java) contain는 문자열에 특정문자열이있는지
        //교집합일시 그문장출력

        list.stream()
                .filter(s -> s.toLowerCase().contains("java"))
                .forEach(s -> System.out.println(s));


    }
}
