package thisisjava.ch16_2.Exam08;



public class ConstructReferenceExamplle {
    public static void main(String[] args) {
        Person person = new Person();
        Member m1 = person.getMember1((id)->{
            Member member = new Member(id);
            return member;
        });
        m1 = person.getMember1((id)->new Member(id));
        m1 = person.getMember1(Member::new);
        System.out.println(m1);

        Member m2 = person.getMember2((id, name)->{
            Member member = new Member(id,name);
            return member;
        });
        m2 = person.getMember2((id,name)->new Member(id,name));

        m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
