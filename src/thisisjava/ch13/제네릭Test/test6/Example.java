package thisisjava.ch13.제네릭Test.test6;

public class Example {
    //제한된 파라미터 숫자를 연산하는 제네릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare ("+t1.getClass().getSimpleName()+ " " + t2.getClass().getSimpleName()
        +")");

        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();

        return (d1 == d2);
    }
    public static void main(String[] args) {

    boolean b1 = compare(4.5,4.5);
        System.out.println(b1);

        boolean b2 = compare(10,10);
        System.out.println(b2);
    }
}
