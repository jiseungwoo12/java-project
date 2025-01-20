package thisisjava.ch18.num1.exam01;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) {
        //일반적으로 하나의 바이트만 출력하진않고
        //바이트 배열을 만들어 write시킨다
        try (OutputStream os = new FileOutputStream("C:/Temp/test2.db",false)){
            //앞서 말했듯이 뒤에 append는 새로운데이터를얻느냐 true 덮어쓰느냐 false를 의미한다.
            //try-with-resource로 close()메서드 자동호출
            //1byte는 127까지이므로 127까지 저장한다.
            byte[] b = {10,20,30,40,50,60,70,80,90,100,127};
                os.write(b,1,3); //인덱스 1~3까지를 버퍼에 저장
            System.out.println("저장성공");
            //여기서 flush메서드를 작성하지않은이유는
            //close를하면 flush기능도 같이해주기때문이다.
            //버퍼에있는 데이터를 출력한다는 의미이다.
        }catch (IOException e){
            e.printStackTrace();
        }
        //이 예제의 실행결과는 temp라는 디렉토리에 test2.db라는 파일을 생성하고 이 바이트값을 얻는다.
    }
}
