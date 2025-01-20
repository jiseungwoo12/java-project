package thisisjava.ch17_2.num17.groupingBy;

import thisisjava.ch17_2.practice.Collect.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        //이번시간에는 남자여자를 그룹핑해서 두개를 나눠담은 그룹핑객체를 만들어본다
        List<Student> stlist = new ArrayList<>();
        stlist.add(new Student("지승우","남자",90));
        stlist.add(new Student("지종우","남자",95));
        stlist.add(new Student("김채원","여자",80));
        stlist.add(new Student("김예진","여자",85));

        //이렇게 stream인터페이스의 collect메서드를 사용하되
        //Collectors의 groupingBy메서드를 매개변수값으로 사용해서
        //람다식으로 기능을 제공해주면된다.
        //이람다식은 key값을 무엇으로 지정하여 그룹화할것이냐 라는의미로 제공한것이다.
        //성별에따라 남자,여자 엔트리로 구분되어 남자엔트리에는 남자만 여자엔트리에는 여자만
        //남자의값으로 이름성별점수가 값으로 리스트형식으로 저장된다
        Map<String,List<Student>> groupmap = stlist.stream()
                .collect(Collectors.groupingBy(s -> s.getSex()));

        List<Student> malelist = groupmap.get("남자");
        malelist.stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();
        
        List<Student> femaleList = groupmap.get("여자");
        femaleList.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
