package thisisjava.ch15.Quiz.num8;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(20010922,"지승우"));
        set.add(new Student(20000424,"지종우"));
        set.add(new Student(20010922,"김승일"));
        set.add(new Student(20010606,"이종창"));

        System.out.println("저장된 객체수: "+ set.size());

        for (Student s : set){
            System.out.println(s.StudentNum+"-"+s.name);
        }
        

    }
}
