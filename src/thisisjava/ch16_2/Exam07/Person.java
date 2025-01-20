package thisisjava.ch16_2.Exam07;

public class Person {
    //함수형인터페이스를 이용할 person클래스
    public Member getMember1(Creatable1 creatable1){
        String id = "winter";
        Member member = creatable1.create(id);

        return member;
    }
    public Member getMember2(Creatable2 creatable2){
        String id = "winter";
        String name = "김민정";
        Member member = creatable2.create(id,name);

        return member;
    }
}
