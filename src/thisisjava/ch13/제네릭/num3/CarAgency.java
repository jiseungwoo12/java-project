package thisisjava.ch13.제네릭.num3;

public class CarAgency implements Rentable<Car>{
    
    //Car 파라미터타입으로 리턴되는 rent추상메서드 오버라이딩
    @Override
    public Car rent(){
        return new Car();


    }
}
