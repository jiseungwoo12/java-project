package thisisjava.ch12.annotation2;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception{
        
        //리플렉션의 getDelaredMethods()는 값을 순서대로 배열에 저장하지않으므로 실행순서가 바뀔수있음
        Method[] methods = Service.class.getDeclaredMethods();
        for (Method method : methods){
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
            //메서드에 에노테이션이 있다면 그 값을 반환하고
            //없다면 null값을 반환한다.
            printLine(printAnnotation);

            method.invoke(new Service());

            printLine(printAnnotation);

        }




    }

    public static void printLine(PrintAnnotation printAnnotation){
        if (printAnnotation != null){
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
