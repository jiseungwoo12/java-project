package thisisjava.ch18.num4.보조스트림;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        //OutputStream에는 보조스트림을 달아주었더니
        //불필요하게 바이트코드로 변경되어 출력되는 일없이
        //문자배열이나 문자로 잘 출력되는것을 볼수있지만
        //InputStream은 보조스트림을 달아줘도 여전히 가독성이 떨어진다.
        try{
            InputStream is = new FileInputStream("C:/Temp/test2.txt");
            Reader reader = new InputStreamReader(is,"UTF-8");
            //여기다가 보조스트림을 하나 더 달아준다 BufferdReader
            BufferedReader br = new BufferedReader(reader);
            //이렇게 BufferedReader란 보조스트림을 달게되면 이스트림은
            String str = br.readLine();
            System.out.println(str);  //이렇게 편하게 파일의 문자열을 얻을수있다

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
