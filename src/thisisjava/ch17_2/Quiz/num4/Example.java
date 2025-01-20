package thisisjava.ch17_2.Quiz.num4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("지승우","개발자"));
        list.add(new Member("지종우","사업가"));
        list.add(new Member("조건호","개발자"));
        list.add(new Member("정의손","개발자"));


        Map<String,List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(s->s.getJob()));

        List<Member> develooper = groupingMap.get("개발자");
        System.out.println("[개발자]");
        develooper.stream()
                .forEach(s-> System.out.println(s));
        System.out.println();
        System.out.println("[사업가]");
        List<Member> businessman = groupingMap.get("사업가");
        businessman.stream()
                .forEach(s-> System.out.println(s));
    }
}
