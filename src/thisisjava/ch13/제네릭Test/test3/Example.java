package thisisjava.ch13.제네릭Test.test3;

public class Example {
    public static void main(String[] args) {
        //자동차를 빌리기위해 자동차대여점에 들린다.
        CarAgency car = new CarAgency();
        //자동차를 렌트한다 렌트타입은 car이다.
        Car mycar = car.rent();
        //자동차를 받았으니 달려본다.
        mycar.run();

        //제주도에놀러갈때 필요한 집을 대여해보자.
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

    }
}
