package thisisjava.ch15.ComparableExam;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    //생성자 construct
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //age값을 비교하여 오름차순 정리하는 compareTo메서드 재정의
    @Override
        public int compareTo(Person o){
            if (this.age < o.age)
                return -1;
             else if (this.age == o.age)
                return 0;
            else
                return 1;
    }

    //만들 클래스에 Comparable인터페이스를 구현하여 자동오름차순 될수있게 한다.


}
