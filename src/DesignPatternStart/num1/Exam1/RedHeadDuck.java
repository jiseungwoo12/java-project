package DesignPatternStart.num1.Exam1;

public class RedHeadDuck extends Duck{
    //Duck클래스의 추상메서드를 재정의해야지만 상속받을수있다
    //상속받은 내용은 quack swim display이고 display만 재정의하면된다
    @Override
    public void display(){
        System.out.println("빨간머리오리입니다.");
    }
}
