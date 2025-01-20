package thisisjava.ch17_2.practice.Collec3;

import thisisjava.ch17_2.practice.Collect.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collect3Example {
    public static void main(String[] args) {
        //이번에는 Map에 학생이름을 키, 학생의 점수를 값으로 갖는 Map을 생성해본다
        List<Student> stlist = new ArrayList<>();
        stlist.add(new Student("지승우","남자",90));
        stlist.add(new Student("지종우","남자",95));
        stlist.add(new Student("김채원","여자",80));
        stlist.add(new Student("김예진","여자",85));
        //Map은 다른컬렉션들과는 다르게 key와 value값 2개를 저장하는 엔트리를 가지고있다고 했다.
        //따라서 요소수집을 하는경우에도.
        //두개의 매개변수를 갖는다 key를 입력할 매개변수,value를 입력할 매개변수
        //두개의 매개변수는 function함수형인터페이스로 입력받으므로 람다식으로 제공할수있다.
        //toMap(Function<T,K> keyMapper,Function<T,K> valueMapper)
        //Function은 apply()메서드를 보유하고있고 이 메서드의 매개변수는 하나이므로
        //키값에는 이름 벨류값에는 점수 이런식으로 가본다면
        Map<String,Integer> newMap = stlist.stream()
                .collect(Collectors.toMap(
                        s->s.getName(),  //,로 찍어서 키값이랑 벨류값을 구분지으면된다.
                        s->s.getScore())
                );
        //Map은 toString을 정의하고있어
        //Map객체만 프린트해도 결과가 나온다 
        //키 = 벨류값
        System.out.println(newMap);
    }
}
