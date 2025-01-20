package DesignPatternStart.num1.Exam03;

public abstract class Duck {
    //이클래스에선 방금까지만든 인터페이스와 인터페이스를 구현한 이유에 대해 알아본다.
    //인터페이스를 필드값으로 지정한다.
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public Duck(){} //기본 생성자 그냥만듬;

    public abstract void display();
    //추상메서드 추상클래스가 되어야한다.

    //위의 필드값에 따라 내용이바뀌는 메서드
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();}


    public void swim(){
        System.out.println("모든 오리는 물에뜹니다.");

    }


}
