package thisisjava.ch17_2.num11;

import java.util.Arrays;

public class PeekStreamExample {
    public static void main(String[] args) {
        //루핑 looping은 스트림에서 요소를하나씩 반복해서 처리한다
        //forEach와 peek가있다 차이점은
        //forEach는 마지막에 최종처리를 하기위한 루핑이고
        //peek는 중간에서 처리를 하기위한 루핑이다.
        //peek로 처리를하고 종료할시
        //스트림은 동작하지않는다 최종처리가 있어야하기때문이다.

        int intarr[] = new int[]{1,2,3,4,5};

        Arrays.stream(intarr)
                //filter로 i%2 2의배수만 골라서 스트림에 흐르게한다.
                .filter(i-> i%2==0)
                //peek는 중간처리 중간에서 잘 걸려졌는지 확인한다.
                .peek(i-> System.out.println(i))
                //잘걸러졌으면 최종처리를 해줘야한다 아니면 동작하지않는다.
                //forEach로 최종처리를 한모습이다
                .forEach(i-> System.out.println(i));
        System.out.println();
        //중간처리 메소드 peek()을 사용하여 반복처리
        int total = Arrays.stream(intarr)
                .filter(i->i%2==0)
                .peek(n-> System.out.println(n))
                .sum();
        System.out.println("총합:"+total);

        //최종 처리 메서드 forEach를 이용해서 합계구하기


    }
}
