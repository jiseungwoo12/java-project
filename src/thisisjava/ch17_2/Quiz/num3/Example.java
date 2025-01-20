package thisisjava.ch17_2.Quiz.num3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        //list에 저장되어있는 멤버중에서 직업이 '개발자'인 사람만 별도의 리스트에 수집하려고 합니다
        //collect(Collections.toList()) 메서드사용
        List<Member> list = Arrays.asList(new Member("지승우","개발자")
        ,new Member("지종우","사업가"),new Member("조건호","개발자"));

        List<Member> develoopMember = list.stream()
                //이렇게 직업이 개발자인 것을 필터링하고 eqauls로 개발자인지 확인하여
                //필터링한다.
                .filter(s -> s.getJob().equals("개발자"))
                //collect(tolist)는 이 중간처리과정을 리스트로 변환하는 작업이다.
                .collect(Collectors.toList());

        develoopMember.stream()
                .forEach(s-> System.out.println(s.getName()));





    }
}
