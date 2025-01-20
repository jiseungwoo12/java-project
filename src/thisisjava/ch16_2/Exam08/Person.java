package thisisjava.ch16_2.Exam08;



public class Person {

    public Member getMember1(Createable1 createable1){
        String id = "wltmddn";
        Member member = createable1.create(id);
        return member;
    }
    public Member getMember2(Createable2 createable2){
        String id = "wltmddn";
        String name = "지승우";
        Member member = createable2.create(id,name);
        return member;
    }
}
