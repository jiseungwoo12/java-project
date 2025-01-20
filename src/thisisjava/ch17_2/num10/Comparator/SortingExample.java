package thisisjava.ch17_2.num10.Comparator;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        //이번에는 클래스에 Comparable을 구현하지않고 
        //직접 sorted메서드의 comparator을 제공하여 사용해보자
        List<Student> list = new ArrayList<>();
        list.add(new Student("지승우",90));
        list.add(new Student("지승우",80));
        list.add(new Student("지승우",95));
        list.add(new Student("지승우",100));

        //점수를 기준으로 오름차순으로 정렬한 새 스트림얻기
        list.stream()
                .sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore()))
                .forEach(s1 -> System.out.println(s1.getName()+":"+s1.getScore()));

        System.out.println();
        //점수를 기준으로 내림차순으로 정렬한 새스트림얻기
        list.stream()
                .sorted((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()))
                .forEach(s1 -> System.out.println(s1.getName()+":"+s1.getScore()));


    }
}
