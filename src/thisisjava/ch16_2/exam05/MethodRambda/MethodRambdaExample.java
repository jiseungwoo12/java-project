package thisisjava.ch16_2.exam05.MethodRambda;

public class MethodRambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //방법1
        //인터페이스구현후 정적메서드 클래스.메서드명으로 식을만듬
        person.action((x,y)-> Computer.staticRambda(x,y));
        //방법2
        //action 인터페이스 구현란에 클래스::메소드명으로 식을만듬
        person.action(Computer :: staticRambda);
        //(x,y)값을 Computer의 static메서드에 대입하고 이식을 리턴함
        //이번엔 인스턴스메서드를 람다식으로 작성해보자
        //방법1
        //클래스객체생성후 기본적인 람다식으로 메서드참조
        Computer computer = new Computer();
        person.action((x,y)->computer.instanceRambda(x,y));
        //방법2
        //클래스이름.메서드이름으로 action메서드의 데이터값을 불러와 식을대입
        person.action(computer::instanceRambda);




    }
}
