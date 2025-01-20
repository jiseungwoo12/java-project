package DesignPatternStart.num1.Exam03;

public class RedHeadDuck extends Duck{

    @Override
    public void display() {
        System.out.println("천둥오리입니다.");
    }
    //Duck의 필드값을 수정하기위한 생성자
    public RedHeadDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


}
