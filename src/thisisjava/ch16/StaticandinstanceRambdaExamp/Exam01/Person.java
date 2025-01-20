package thisisjava.ch16.StaticandinstanceRambdaExamp.Exam01;

//import thisisjava.ch16.FuntionalProgramming.Calculator;
//import thisisjava.ch16.FuntionalProgramming.returnLambdaExam.Calcuable;

public class Person {
    //Person객체에 함수형인터페이스의 내용을 출력할 코드작성
    //출력내용이기때문에 void로 출력
    public void action(Calculator calculator){
        double result = calculator.calc(10,4);
        System.out.println("결과:"+result);
    }
}
