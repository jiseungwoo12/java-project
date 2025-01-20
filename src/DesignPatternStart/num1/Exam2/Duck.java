package DesignPatternStart.num1.Exam2;

public abstract class Duck {
//인터페이스를 이용하여 일부오리만 꽥꽥거리거나 날수있게하자
    public abstract void display();
    public void swim(){
        System.out.println("둥둥 떠다닙니다.");
    }
}
