package thisisjava.ch13.제네릭.num3;

public class HomeAgency implements Rentable<Home>{

    //인터페이스의 추상메서드 오버라이딩
    //이 메서드는 Home값으로 리턴받는다.
    @Override
    public Home rent(){
        return new Home();
    }
}
