package thisisjava.ch17_2.num10.Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStreamExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("지승우",90));
        list.add(new Student("지종우",100));
        list.add(new Student("지동우",75));
        list.add(new Student("지장우",85));


        list.stream()
                .sorted()  //Student에있는 정렬타입 오름차순으로 정렬함
                .forEach(st -> System.out.println(st.getName() + ":"+st.getScore()));
        System.out.println();
        //점수를 기준으로 내림차순으로 정렬한 새스트림얻기
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getScore()));


    }


}
