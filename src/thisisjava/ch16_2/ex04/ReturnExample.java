package thisisjava.ch16_2.ex04;

import thisisjava.ch16_2.exam04.Person;

public class ReturnExample {
    public static void main(String[] args) {
        //리턴값이 있는 람다식
        Person person = new Person();
        person.action((x,y)->{return x+y;});
        //리턴문이 하나일시 이렇게 즉시 처리를 할수있다.
        person.action((x,y)-> x+y);

    }
}
