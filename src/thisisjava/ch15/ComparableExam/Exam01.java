package thisisjava.ch15.ComparableExam;

import java.util.TreeSet;

public class Exam01 {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("지승우",24));
        treeSet.add(new Person("유진실",51));
        treeSet.add(new Person("지종우",25));
        treeSet.add(new Person("지동산",56));

        for (Person p : treeSet){
            System.out.println(p.name +"-"+p.age);
        }

    }
}
