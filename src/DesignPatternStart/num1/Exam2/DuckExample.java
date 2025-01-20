package DesignPatternStart.num1.Exam2;

public class DuckExample {
    public static void main(String[] args) {
        //이제 만든 오리들의 행동을 구사해보자
        //이렇게하려면 인터페이스를 구현한 클래스를 리모컨으로 사용하지않으면 그 기능을 쓸수없다.
//        Duck duck = new ModelDuck();
        RedHeadDuck duck = new RedHeadDuck();
        duck.display();
        duck.swim();
        duck.fly();
        duck.quack();

        //모형 오리  //
        ModelDuck duck1 = new ModelDuck();
        duck1.display();
        duck1.swim();
        duck1.fly();
        duck1.quack();

        //이렇게 인터페이스로 나눈다면 좀번거롭지만
        //그 인터페이스를 구현한 객체만 날수있고 소리를 낼수있다.
    }
}
