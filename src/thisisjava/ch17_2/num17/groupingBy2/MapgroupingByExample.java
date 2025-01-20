package thisisjava.ch17_2.num17.groupingBy2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapgroupingByExample {
    public static void main(String[] args) {
        List<Student> strlist = List.of(
                new Student("지승우","남",90),
                new Student("지종우","남",90),
                new Student("김채원","여",85),
                new Student("김예진","여",83)
        );
        //이번에는 이 리스트를 스트림으로 흐르게한다음,
        //남자와 여자를 그룹핑하여 각각 담고 남자,여자의 평균점수를 따로따로 담은 Map객체를 생성해본다.
        Map<String,Double> studentMap = strlist.stream()
                //groupingBy매개란은 두개의 매개변수를 지니고있다
                //첫번째 매개변수에다가는 key값을 무엇으로 설정하여 그룹핑할것인지에대한 람다식을 써주고
                //,콤마로 구분지어 Collectors의 정적메서드를 사용해 평균메서드를 호출하면
                //value값에는 남,여의 평균점수값이 계산이된다.
                .collect(Collectors.groupingBy(
                        s -> s.getSex(),
                        Collectors.averagingDouble(s->s.getScore())
                ));
        System.out.println(studentMap);


    }
}
