package thisisjava.ch13.제네릭Test.test3;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
