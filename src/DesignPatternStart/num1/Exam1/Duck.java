package DesignPatternStart.num1.Exam1;

public abstract class Duck {
    //일반적으로 상위클래스를 상속받아 모든 오리에게 같은 메서드를 사용하게만드는 test
    //꽉꽉
    public void quack(){
        System.out.println("꽉꽉~");
    }
    //헤엄치기
    public void swim(){
        System.out.println("물에 떠다니기");
    }
    //추상메서드 display는
    //오리마다 외관은 변경해야하기때문에 추상메서드
    //abstract메서드가 하나라도 존재할시 이클래스는 추상클래스가된다.

    public abstract void display();

}
