package thisisjava.ch16_2.exam04;

public class Person {
    public void action(Calculable calculable){
        double result = calculable.calc(10,4);
        System.out.println("결과: "+ result);
    }
}
