package thisisjava.ch12.checkproblem.number1;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        //hashset은 중복된 값을 저장할수없는 자료구조이다.
        //equals()와 hashcode()오버라이딩을통해 수정해보자
        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 학생의 수:" +hashSet.size());

    }
}
