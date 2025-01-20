package thisisjava.ch13.제네릭.num3;

public class GenericExample {

    public static void main(String[] args) {

        CarAgency car = new CarAgency();
        Car car1 = car.rent();
        car1.run();

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();
    }
}
