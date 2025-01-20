package thisisjava.ch17_2.num15;

import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {

        List<Student> list = List.of(
                new Student("지승우",90),
            new Student("지종우",85),
                new Student("지동우",75)
        );
        //방법 1
        int sum = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        System.out.println("방법1 합계:"+sum);

        //방법2
        int sum2 = list.stream()
                .mapToInt(Student::getScore)
                .reduce(0,(a,b)->a+b);

        System.out.println("방법2 합계:"+sum2);
    }
}
