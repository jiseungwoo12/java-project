package thisisjava.ch16.noParameterExam;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();
        //람다식을 작성할때에는
        //action1(()->{})
        // 메서드이름( 괄호() ->화살표 {}중괄호를 써준다.
        //action(Workable)의
        person.action1((name,work)->{
            System.out.println(name + "이 ");
            System.out.println(work+"을 합니다.");
        });
        person.action1((name,work)->{
            System.out.println(name + "이 ");
            System.out.println(work+"을 하지않습니다.");
        });

        person.action2((speak)->{
            //중괄호안에는 실행문을 작성한다.
            System.out.println(speak+"라고 인사합니다.");
        });
        //실행문이 하나일때는 중괄호를 {}을 생략할수있다.
        person.action2(speak->
            //중괄호안에는 실행문을 작성한다.
            System.out.println(speak+"라고 인사합니다.")
        );
        //다시 매개변수가 하나일때는?
        //괄호를 생략할수있다.
        person.action2(speak->{
            //중괄호안에는 실행문을 작성한다.
            System.out.println(speak+"라고 인사합니다.");
        }); //이괄호는 action()매개변수의 끝을 의미한다.
        //실행문이 하나일때는? 중괄호를 생략할수있다,

    }
}
