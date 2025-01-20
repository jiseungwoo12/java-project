package thisisjava.ch17_2.StreamMethod;

import java.util.stream.IntStream;

public class Method {

    public static void main(String[] args) {
        //여기에서는 지금까지 사용한 스트림인터페이스의 메서드와 기능을 정리해본다.
        //첫번째 forEach
        //void forEach(Consumer<? super T> action)
        //Consumer 매개변수값은 함수형인터페이스이고
        //void accept(T t)라는 메서드를 람다식으로 구현하도록되어있다
        //따라서 forEach() 매개변수 입력란에는 리스트나 배열등 컬렉션의 요소를 반복해서 읽거나 처리한다.
        //두번째 리소스로 부터 스트림얻기
        //컬렉션 list set 은 리턴타입이 일반 Stream<T> 객체이므로
        //리스트나 셋의 저장되어있는 객체의 타입으로 String일시
        //Stream<String> stream = list.stream();
        //stream.forEach(s->System.out.println(s));
        //Stream객체에다가 stream을 저장하고 forEach()를하여 값들을 반복해서 읽어오면된다.
        //하지만 배열일때는
        //String strarr[] = new String[] {};
        //밑에코드처럼 Arrays의 정적메소드를 사용하여 Stream으로 리턴시켜야한다.
        //Stream<String> stream = Arrays.stream(strarr);
        //int는 intStream double은 DoubleStream
        //하지만 다른방법도있다
        int intarr[] = new int[]{1,2,3,45};
        //이렇게 Intstream이나 stream의 정적메소드인 of를 사용하여
        //배열을 맞는객체한테 리턴시키면된다. 두가지방법인것이다.
        IntStream intStream = IntStream.of(intarr);
        intStream.forEach(s-> System.out.print(s));

        



    }
}
