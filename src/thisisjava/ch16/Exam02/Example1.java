package thisisjava.ch16.Exam02;

public class Example1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(()->{
            System.out.println("출근을합니다.");
            System.out.println("프로그래밍을 합니다.");
                });

        //실행문이 한개일경우 중괄호 생략
        person.action(()->
                        System.out.println("퇴근합니다.")
                );

    }
}
