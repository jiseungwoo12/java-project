package thisisjava.ch12.annotation2;

public class Service {

    @PrintAnnotation
    public static void method1(){
        System.out.println("실행내용");
    }
    @PrintAnnotation("*")
    public static void method2(){
        System.out.println("실행내용2");
    }
    @PrintAnnotation("#")
    public static void method3(){
        System.out.println("실행내용3");
    }

}
