package thisisjava.ch12.wrapperTest;

public class BoxingandUnBoxing {

    //박싱과 언박싱
    //기본타입의 값을 포장객체로 만드는과정을 박싱boxing이라고하고
    //반대로 포장객체에서 기본타입으로 만드는과정을 언박싱unboxing이라고함
    public static void main(String[] args) {
        //더이상사용되지않는 Deprecate 생성자
//        Integer obj = new Integer(100);
        Integer obj = Integer.valueOf(1000);
        //Integer의 valueOf 스태틱메서드로 값을 얻는다.
        System.out.println(obj);
        //오토박싱
        Integer obj2 = 100;
        //언박싱
        int value = obj2;

    }

}
