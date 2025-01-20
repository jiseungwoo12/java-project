package thisisjava.ch16_2._exam01;



public class RambdaDefine {
    public static void main(String[] args) {

    //이제 람다식을 작성한다
        Computer computer = new Computer();
        //매개변수가없으면()칸을 비워둔다 매개변수위치임.
        computer.action(()->{
            //이코드는 Calculable의 메서드를 익명객체로 구현하는과정이다
            System.out.println("더하기를 합니다");
            System.out.println("계산을합니다");
        });

        computer.action(()->{
            System.out.println("빼기를합니다.");
        });
    }
}
