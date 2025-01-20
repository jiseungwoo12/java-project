package thisisjava.ch17_2.num8;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("지승우",95));
        list.add(new Student("지승우",90));
        list.add(new Student("지종우",95));

        list.stream()

                .mapToInt(n -> n.getScore())
                //매핑을한후 distinct를 호출하면?
                .distinct()
                //흘러가는 같은점수가있을시 equals중복되기때문에 제외시킨다.
                .forEach(n -> System.out.println(n));

    }
}
