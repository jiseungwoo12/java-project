package thisisjava.ch13.제네릭Test.test3;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
