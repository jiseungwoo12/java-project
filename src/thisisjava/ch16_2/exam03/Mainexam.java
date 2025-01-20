package thisisjava.ch16_2.exam03;

public class Mainexam {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.action((x,y)->{
            return x+y;
        });
        //매개변수가 하나일땐 ()생략가능
        computer.action((x,y)->{
            return x-y;
        });
        //리턴문이하나일땐 if나 while이아닐때.
        //괄호생략가능
        computer.action((x,y)->x*y
        );
    }
}
