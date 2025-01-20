package thisisjava.ch18.num2.InputStream;

import java.io.*;

public class ReadCopyExample {
    public static void main(String[] args) {
        //이번에는 Temp디렉토리에 있는 test.jpg파일을 복사해서 test2.jpg파일을하나 만들어본다.
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";
        try (InputStream is = new FileInputStream(originalFileName);
             OutputStream os = new FileOutputStream(targetFileName)){

            byte [] data = new byte[1024]; //1024는 1KB이다
            while (true){
                int num = is.read(data);
                //이렇게 read(data) 메서드를 사용하면
                //data변수에 입력값이 들어간다 1024바이트개수
                //1kb로 28.1kb를 28번 입력하고 0.1kb를 출력해야하므로 
                if (num==-1)break;
                //이렇게 출력할 데이터값을 쓰고 0,num 마지막에 0.1kb를 출력해야하므로 써준다.
                //만약 그냥 data값을 1024로 계속 출력할시
                //그림의 데이터가 망가지므로 내보낼바이트값을 잘 지정해주어야한다.
                os.write(data,0,num);
                //0,num 1024바이트로 29번 돌고 나머지 0.1은 0.1바이트값만 출력되는것이다.
            }
            //output은 아까 말했듯이 flush를 해주어야 버퍼에있는 데이터가 출력된다
            os.flush();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
