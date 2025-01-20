package thisisjava.ch18.num2.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadStream2Example {
    public static void main(String[] args) {
        //이번에는 read(byte[]b) 메서드를 활용해보자
        //많은양의 데이터를 읽을때는 이메서드를 사용하는것이 좋다.
        //먼저 매개값을 넣기 위해서는 바이트배열을 생성해주어야한다
        //왜 바이트 배열이냐 하믄 read로 읽을수있는 값은 byte이여서다.
        byte[] data = new byte[100];

        try (InputStream is = new FileInputStream("C:/Temp/test2.db")){
        //이 메서드는 바이트수를 int로 리턴하는데
            while (true) {
                int num = is.read(data);
                if (num == -1)break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
