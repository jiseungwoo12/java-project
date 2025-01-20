package thisisjava.ch16_2.exam03;


public class Computer {
    
    //매개변수가있는 람다식
    public void action(Calculable calculable){
        double x = 3;
        double y = 5;
        System.out.println(calculable.calc(x,y));
    }
}
