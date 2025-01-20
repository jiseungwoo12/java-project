package thisisjava.ch12.reflection;

public class Replaction2 {
    //패키지와 타입 정보얻기
    public static void main(String[] args) throws  Exception{
        //패키지와 타입 (클래스 인터페이스) 이름 정보는 다음 메서드를 통해 얻을수있다.
        //Package getPackage()  패키지정보읽기
        //String getSimpleName() 패키지를 제외한 타입 이름
        //String getName() 패키지를 포함한 전체 타입이름

//방법1        Class clazz = Car.class;
// 2       Class clazz = Class.forName("ch12.reflection.Car");
//3
//        Car car = new Car();
//        Class getcar = car.getClass();

//        System.out.println("패키지 :" + getcar.getPackage());  //패키지경로의 클래스
//        System.out.println("클래스 간단이름:" +getcar.getSimpleName()); //클래스명
//        System.out.println("클래스 전체이름: " +getcar.getName()); //패키지를 포함

    }
}
