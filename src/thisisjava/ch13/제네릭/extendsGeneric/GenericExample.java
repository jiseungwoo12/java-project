package thisisjava.ch13.제네릭.extendsGeneric;

public class GenericExample {
    //제한된 타입 파라메터를 갖는 제네릭메소드
    //T extends Number Number이거나 Number의 자식객체만 들어올수있음
    //compare(...) 매개변수값에 무슨 객체가 들어왔는지에 따라 <T>가 결정됨

    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare(" + t1.getClass().getSimpleName()+", "+ t2.getClass().getSimpleName()
        +")");
        //doubleValue()를 쓸수있는이유는 Number이거나 자식객체의 객체를 받는다는 제한한에서
        //double객체가 있다는 의미로 double객체의 메서드를 사용가능하다.
        boolean result = true;
        if(t1 instanceof Double v1 && t2 instanceof Double v2) {
            double d1 = v1.doubleValue();
            double  d2 = v2.doubleValue();
             result = (d1 == d2);
        } else if (t1 instanceof Integer v1 && t2 instanceof Integer v2) {
            Integer i1 = v1;
            Integer i2 = v2;
             result = (i1.equals(i2));
        }
        return result;
    }
    public static void main(String[] args) {

        boolean result = compare(10,10);
        System.out.println(result);

        boolean result2 = compare(4.5,4.5);
        System.out.println(result2);




    }
}
