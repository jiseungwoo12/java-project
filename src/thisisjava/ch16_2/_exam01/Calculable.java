package thisisjava.ch16_2._exam01;

@FunctionalInterface
public interface Calculable {
    //람다식을 사용하기위해선 첫번째론
    //함수형 인터페이스를 정의하여야한다
    //함수형 인터페이스는 추상메서드가 하나만 존재하는 이라는뜻
    //알아볼첫번째는 매개변수가없는 람다식을 작성해본다.
    void calculater();
}
