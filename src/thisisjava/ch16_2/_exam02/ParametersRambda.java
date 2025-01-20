package thisisjava.ch16_2._exam02;

public class ParametersRambda {
    public static void main(String[] args) {

        //이번에는 매개변수가 있는 람다식을 구현할것이다.
        //문제 컴퓨터라는 클래스의 action()이라는 데이터로
        //더하기 빼기 곱하기 나누기 나머지구하기를 하고싶다.

        //먼저 함수형 인터페이스를 정의한다
        //그다음 컴퓨터클래스를 만들어 데이터를 만든다.
        //데이터를 입력받아 데이터의 내용을 어떻게 처리할지 람다식으로 구현한다.
        Computer computer =new Computer();

        computer.action((x,y)->{
            double result = x+y;
            return result;
        });


    }
}
