package thisisjava.ch16_2.exam04;

public class MethodRambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //정적메서드를 람다식에서 사용
        person.action((x,y)->
            Computer.staticaction(x,y)
        );
        //인스턴스 메서드를 람다식으로적용
        //인스턴스 메서드를 사용하려면 객체를 생성해야한다
        Computer computer = new Computer();
        //1번째방법 리턴문사용하기
        person.action((x,y)->{return computer.instanceMethod(x,y);});
        //2번째방법 리턴문이하나일시 중괄호를 생략할수있음
        person.action((x,y)->computer.instanceMethod(x,y));
        //3번째 방법 위에 코드를 간단하게 줄일수있음
        //computer의 instance메서드의 데이터를 받아 action을 실행
        person.action(computer::instanceMethod);
    }
}
