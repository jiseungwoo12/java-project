package thisisjava.ch16_2._exam02;

public class Computer {
    //데이터를 저장하는 메서드
    public void action(Calculable calculable){
        double x = 5;
        double y = 6;
        System.out.println(calculable.calc(x,y));
    }
}
