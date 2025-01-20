package thisisjava.ch13.제네릭.num3;

public interface Rentable <P>{
    //P를 리턴하는 rent()추상메서드
    //타입 파라미터 P를 리턴타입으로 사용
    P rent();
}
