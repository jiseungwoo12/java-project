package thisisjava.ch18.num2.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadStreamExample {
    public static void main(String[] args) {
        //이번에는 아까 temp디렉토리에 출력해두었던
        //test1.db의 내용을 입력값으로 받아 출력을해보는과정을 배운다
        //아까도 말했듯이 FileInputStream은 예외를 발생시키므로 try catch문으로 예외처리를한다
        try (InputStream is = new FileInputStream("C:/temp/test1.db");){
            while (true){
                //input스트림의 read메서드는
                //int형으로 리턴하기때문에 int 변수로 값을 받는다.

                int data = is.read();
                //read()를할시 while문으로 반복해서 읽어주면 더이상 읽을수없는 값이 될경우
                //read는 -1을 리턴한다.
                if (data == -1){
                    //배운대로 읽을수없는 데이터값이 되면 -1이 출력되는것을 알수있다.
                    System.out.println(data+" 읽을수없는 데이터입니다. ");break;};
                System.out.println(data);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
