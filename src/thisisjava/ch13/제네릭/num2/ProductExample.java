package thisisjava.ch13.제네릭.num2;

public class ProductExample {
    public static void main(String[] args) {

        Product <Car,String> product = new Product<>();
        product.setKind(new Car());  //setKind는 Car객체의 타입으로 셋해야한다.
        product.setModel("그랜져");
        Car car = product.getKind();
        String modelname = product.getModel();

        Product<Tv,String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("아반떼");
        Tv t = product1.getKind();
        String Tvname = product1.getModel();



    }
}
