package thisisjava.ch18.num7.printStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    public static void main(String[] args) {

        //PrintStream과 PrintWriter는 프린터와 유사하게 출력하는
        //println(),print(),printf() 메소드를 가지고잇는 보조 스트림이다.
        //지금까지 우리는 콘솔에 출력하기위해 System.out.print()을 사용하였는데
        //그 이유는 out이 PrintStream타입이기 때문이다.
        //System의 필드인 out이 PrintStream타입 PrintStream의 정적메소드인 println() 사용
//        System.out.println("지승우");

       //PrintStream은 바이트출력 스트림 OutputStream과 연결되고
       //PrintWriter는 문자출력 스트림 Writer와 연결된다
       //api도큐먼트상에서는 PrintWriter에는 바이트출력스트림도 들어갈수있게되었지만
       //문자 -> 문자출력 이런 구조가 성능적으로 좋을것이다.
        //printf()는 format String을 출력한다는 2장에서 배웠었다

        try {

            OutputStream os = new FileOutputStream("C:/Temp/PrintSteam.txt");
            PrintStream ps = new PrintStream(os);
            ps.println("이 예제는 printStream을 사용하기 위함");
            ps.print("print메서드로 문자열을 줄바꿈하지않고 추가");
            ps.println();
            //%6d는 출력할 정수의 최대 너비를 6자리로 설정
            //%-10s는 출력할 문자열의 최소너비를 10으로 설정하고 왼쪽정렬하는 형식
            //%10s는 우측
            ps.printf("| %6d | %-10s | %10s | \n",1,"지승우","개발자");
            ps.printf("| %6d | %-10s | %10s | \n",2,"지종우","사업가");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
