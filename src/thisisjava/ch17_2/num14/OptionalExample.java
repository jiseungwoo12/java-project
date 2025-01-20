package thisisjava.ch17_2.num14;

import java.util.*;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        //이번에는 왜 Optional이라는 클래스에 값을 리턴을할까라는 의미에 대해 살펴보자
        //Optional클래스는
        //단순히 집꼐값만 저장하는 것이아니라
        //집계값의 여부를 체크하고 집계값이 없다면 집계값을 디폴트값으로 설정하거나
        //집계값을 처리하는 Consumer를 등록할수잇다. Consumer = test(t t)라는 메서드를 가지고잇는
        //함수형 인터페이스이다.
        //Optional클래스의 orElse같은 메서드는 최종처리를하기위한 메서드로 사용가능하다.

        //boolean isPresent() 메서드
        //이 메서드는 집계값이 존재하는지 여부에따라 if else로 나눠 실행시키거나
        //else일시 0.0으로 실행시킬수있다.

        //일단 아무것도 집계값이없는 리스트를 생성해둔다.
        List<Integer> list = new ArrayList<>();

//        double avg = list.stream()
//                .mapToInt(Integer :: intValue)
//                .average()
//                .getAsDouble();
//        System.out.println(avg);
        //위와같이 집계값이 없는 배열을 갖다가 스트림으로 흐르게할시
        //NoSuchElementException라는 예외를 발생시킨다.
        //그렇다면 if else문으로 집계값의 여부를 체크하는 메서드를 사용해보자
        //isPresent()메서드
        OptionalDouble optional = list.stream()
                .mapToInt(Integer:: intValue)
                .average();
        if (optional.isPresent()){
            System.out.println("방법1 평균: "+optional.getAsDouble());
        }else
            System.out.println("방법1 평균: 0.0");

        //방법2 orElse()메서드를 사용하여 최종처리를한다
        //집계값이 없을경우 이메서드를 실행시켜 디폴트값을 설정해준다.

        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("평균값:"+avg);  //집계값이없으므로 orElse가실행되어 0.0으로 설정된것을
        //알수있다.

        //방법3 ifPresent 집계값이 있을경우 consumer로 처리
        //consumer는 void형식으로된 test(T t)가있는 함수형인터페이스이므로
        //ifPresent는 void를 리턴값으로 갖기때문에 리턴값을 받을 객체를 생성하지않아도되고
        //ifPresent 람다식입력란에서 결과값을 출력시키는 용도로 사용하기때문이다.
        //결론은 이메서드는 집계값이 있을시 실행시킨다
       list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3 평균:"+a));


        
    }
}
