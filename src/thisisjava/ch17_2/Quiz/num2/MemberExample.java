package thisisjava.ch17_2.Quiz.num2;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    public static void main(String[] args) {
        //list에 저장되어있는 멤버의 평균 나이를 출력하려고한다
        //1 리스트생성
        List<Member> list = new ArrayList<>();
        list.add(new Member("지승우",24));
        list.add(new Member("지종우",25));
        list.add(new Member("유진실",52));
        list.add(new Member("지동산",57));
        //2 double값으로 평균값을 반환하는 스트림객체 생성
        double avg = list.stream()
                .mapToInt(i -> i.getAge())
                .average()
                .getAsDouble();
        System.out.println("평균 나이:"+avg);
    }
}
