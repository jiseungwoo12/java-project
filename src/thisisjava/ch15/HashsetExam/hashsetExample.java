package thisisjava.ch15.HashsetExam;

import java.util.HashSet;
import java.util.Set;

public class hashsetExample {
    public static void main(String[] args) {

        //기본적으로 hashset은 중복된 객체를 저장할수없다.
        //지네릭스타입으로 선언된타입은 클래스나인터페이스의 객체만 들어올수있다.
        Set<String> set = new HashSet<>();

        set.add("java");  //new String("java")와 같은 코드.
        set.add("C");
        set.add("kotlin");
        set.add("C#");
        set.add("java");

        int size = set.size();
        System.out.println("hashset의 객체개수: "+ size);






    }
}
