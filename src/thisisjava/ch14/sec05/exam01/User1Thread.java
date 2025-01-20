package thisisjava.ch14.sec05.exam01;

public class User1Thread extends Thread{
    private Calculator calculator;

    public User1Thread(){
        setName("user1Thread");
    }
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }


    public void run(){
        calculator.setMemory2(100);
    }
}
