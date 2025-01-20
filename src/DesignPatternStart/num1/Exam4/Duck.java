package DesignPatternStart.num1.Exam4;

import thisisjava.ch16.Exam05.Calcuable;

interface FlyBehavior {
    void fly();
}
class RocketFly implements FlyBehavior{
    public void fly(){
        System.out.println("로켓 추진력으로 올라갑니다.");
    }
}
class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("납니다.");
    }
}
class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("날지 못합니다.");
    }
}
interface QuackBehavior{
    void quack();
}
class Quack implements  QuackBehavior{
    public void quack(){
        System.out.println("꽉");
    }
}
class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("소리를 내지 못합니다.");
    }
}

class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("빨간머리 오리입니다.");
    }
}
class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    public void display(){
        System.out.println("모형 오리입니다.");
    }
}
//사냥꾼들이 오리소리를 내는 클래스
//duck클래스를 상속받지않고 오리호출기를 사용하는방법
class hunter implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("오리소리를 냅니다 꽉꽉.");
    }
}
class hunter2{
    //클래스에 인터페이스를 구성한다.
    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void ducksoundMachine(){
        quackBehavior.quack();
    }
}




public abstract class Duck {

   public FlyBehavior flyBehavior;
   public QuackBehavior quackBehavior;

   public void performFly(){
       flyBehavior.fly();
   }
   public void performQuack(){
       quackBehavior.quack();
   }
    public void swim(){
        System.out.println("물에 둥둥 뜹니다.");
    }

    //동적으로 행동을 지정한다
    public void setFlyBehavior(FlyBehavior fb){
       flyBehavior = fb;
    }

   public abstract void display();

    public static void main(String[] args) {

        Duck redheadDuck = new RedHeadDuck();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new RocketFly());
        modelDuck.performFly();

        System.out.println();
        //사냥꾼이 오리호출기를 쓴다
        hunter2 hunter2 = new hunter2();
        hunter2.setQuackBehavior(new Quack());
        hunter2.ducksoundMachine();


    }





}
