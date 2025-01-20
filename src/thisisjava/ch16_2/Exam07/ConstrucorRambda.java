package thisisjava.ch16_2.Exam07;

public class ConstrucorRambda {
    public static void main(String[] args) {
        Person person = new Person();

       Member m1 = person.getMember1((id)->{
           Member m = new Member(id);
           return m;
       });
        System.out.println(m1);
        Member m2 = person.getMember2((id,name)->{
            Member m = new Member(id,name);
            return m;
        });
        System.out.println(m2);


        //getMember메서드는 id만을매개변수로가지고있는 인터페이스를 매개변수로받으므로
        //이코드는 id만 받을수있는 람다식이다.
        Member m3 = person.getMember1(Member::new);
        //getMethod2메서드는 id와name값을 둘다받는 인터페이스를 매개변수로 받음.
        Member m4= person.getMember2(Member::new);


    }
}
