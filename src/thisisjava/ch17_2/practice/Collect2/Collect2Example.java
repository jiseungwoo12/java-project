package thisisjava.ch17_2.practice.Collect2;

import thisisjava.ch17_2.practice.Collect.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect2Example {
    public static void main(String[] args) {
        //이번에는 반복해서 set컬렉션으로 새로생성보겠다
        List<Student> stlist = new ArrayList<>();
        stlist.add(new Student("지승우","남자",90));
        stlist.add(new Student("지종우","남자",95));
        stlist.add(new Student("김채원","여자",80));
        stlist.add(new Student("김예진","여자",85));


        Set<Student> femaleSet = stlist.stream()
                .filter(s->s.getSex().startsWith("여"))
                .collect(Collectors.toSet());

        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
