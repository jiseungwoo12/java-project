package thisisjava.ch13.제네릭Test.test3;

public interface Rentable <T>{
    //다양한 대상을 렌트하기 위해 메소드의 리턴타입을 타입파라미터로 선언한다.
    T rent(); //추상메서드 다른 클래스에서 재정의해서 사용해야한다.
}
