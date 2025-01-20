package DesignPatternStart.num1.Exam1;

public class DuckExample {
    public static void main(String[] args) {
        //이제 오리객체를 생성하여 행동을 사용해보자
        Duck duck = new MallardDuck();
        duck.quack();
        duck.swim();
        duck.display();
        //Duck클래스는 추상클래스이므로 전달받을값에 추상클래스를 재정의한클래스를 값으로 받아야한다
        //재정의된 메서드의 내용이 전달되므로 물오리객체라는것을 출력한다.
    }
}
