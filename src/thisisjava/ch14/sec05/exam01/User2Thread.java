package thisisjava.ch14.sec05.exam01;

public class User2Thread extends Thread{
    private Calculator calculator;

    public User2Thread(){
        setName("user2Thread");
    }
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }


    public void run(){
        calculator.setMemory2(50);
    }
}
