package thisisjava.ch16_2._exam02;

public class WorkableExam {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(()->{
            System.out.println("문서를 작성합니다.");
        });

        //실행문이 하나일때는 {}를 생략할수있다
        person.action(()-> System.out.println("코딩을 합니다."));
    }
}
