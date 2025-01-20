package thisisjava.ch16_2.exam05.MethodRambda;

public class Person {
    public void action(Calcurable calcurable){
        double result = calcurable.calc(10,4);
        System.out.println("결과:"+result);
    }
}
