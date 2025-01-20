package thisisjava.ch16.StaticandinstanceRambdaExamp.Exam01;

@FunctionalInterface
public interface Calculator {
    //먼저 람다식을사용하기위해 함수형 인터페이스를 정의
    public double calc(double x,double y);
}
