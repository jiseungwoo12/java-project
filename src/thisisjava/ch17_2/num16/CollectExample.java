package thisisjava.ch17_2.num16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("지승우","남",24));
        studentList.add(new Student("지종우","남",25));
        studentList.add(new Student("문현무","남",26));
        studentList.add(new Student("유진실","여",52));

        //남학생만 묶은 리스트생성

//        List<Student> maleList = studentList.stream()
//                .filter(s->s.getSex().equals("남"))
//                .collect(Collectors.toList());

        //자바 16이후론 간단하게 줄여쓸수있다
        //toList()메서드로 list에 추가할수있다.
        List<Student> malelist = studentList.stream()
                        .filter(s->s.getSex().equals("남"))
                                .toList();

        malelist.stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        //학생 이름을 키, 학생의 객체를 값으로 갖는 Map컬렉션 생성
        Map<String,Student> mapStudent = studentList.stream()
                .collect(
                        Collectors.toMap(
                                s->s.getName(),
                                s->s  //Student객체를 value값에다 반환
                        ));
        System.out.println(mapStudent);

    }
}
