package thisisjava.ch12.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Replaction3 {
    public static void main(String[] args) throws Exception{
        //멤버 정보 얻기
        //타입 클래스인터페이스가 가지고있는 멤버정보얻기

        //타입                메서드이름                   용도
        //Constructor[] getDeclaredConstructors()   생성자 정보읽기
        //Field[] getDeclaredFields()                  필드 정보읽기
        //Method[] getDeclaredMethods()             메서드 정보 읽기

       //일단 메서드영역에 생성된 Car의 바이트코드를 값을 Class객체에 저장해야한다
        Class clazz = Class.forName("thisisjava.ch12.reflection.Car");
                            //forName을 사용할때는 전체 패키지.클래스명을써야한다.
        System.out.println("생성자 정보");
//        System.out.println(clazz.getName());

        //생성자값을 얻어와보자
        //클래스에.선언된생성자(); 라는뜻
        Constructor [] constructors = clazz.getDeclaredConstructors();
       for (Constructor constructor : constructors){
           System.out.print(constructor.getName() + "(");
           Class [] parameters = constructor.getParameterTypes();
           PrintParameters(parameters);
           System.out.println(")");
       }
       //필드정보가져오기
        System.out.println("필드정보");
        Field[] fields = clazz.getDeclaredFields();
       for (Field field : fields){
           System.out.println(field.getType().getName() + " " +field.getName());
       }
        System.out.println();

        //메서드 정보 가져오기
        System.out.println("메서드정보");
        Method [] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.print(method.getName()+ "(");
            Class [] parameters = method.getParameterTypes();
            PrintParameters(parameters);
            System.out.println(")");
        }

    }
    private static void PrintParameters(Class [] parameters){
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if (i< (parameters.length-1)){
                System.out.print(",");
            }
        }

    }
}
