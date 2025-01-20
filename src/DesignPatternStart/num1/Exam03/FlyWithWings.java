package DesignPatternStart.num1.Exam03;

public class FlyWithWings implements FlyBehavior{
    //날수있는 클래스를 구현한다.
    @Override
    public void fly() {
        System.out.println("날개짓을 한다.");
    }
}
