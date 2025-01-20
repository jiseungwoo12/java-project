package thisisjava.ch15.HashsetExam.Exam2;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    //객체의 값을 비교하기위해 hashcode와 equals메서드를 재정의하였다.
@Override
    public int hashCode(){
        return name.hashCode()+age;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Member target){
           return (target.name.equals(this.name)) && (target.age == this.age);
        }else
            return false;
    }






}
