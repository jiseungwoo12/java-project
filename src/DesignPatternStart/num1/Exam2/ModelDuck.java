package DesignPatternStart.num1.Exam2;

import java.sql.SQLOutput;

public class ModelDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("모형오리");
    }

    @Override
    public void fly() {
        System.out.println("날지못한다");
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
    //이번오리는 모형오리이므로 날지못하고 꽥소리가아닌 삑삑소리로 변경한다
    
}
