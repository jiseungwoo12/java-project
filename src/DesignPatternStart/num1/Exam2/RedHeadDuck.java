package DesignPatternStart.num1.Exam2;

import thisisjava.ch16Quiz2.num5_2.Function;

public class RedHeadDuck extends Duck implements Flyable,Quackable {
    //이렇게된다면 이 오리는 날수있고 꽥꽥거리는 오리이다.
    //Duck과 flyable quackable에 있는 추상메서드를 모두 구현해야한다는 단점이있다
    public void display(){
        System.out.println("빨간오리입니다.");
    }
    public void fly(){
        System.out.println("이 오리는 날수잇습니다.");
    }
    public void quack(){
        System.out.println("괙꼬ㅓㅐㄱ");
    }
}
