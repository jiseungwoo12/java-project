package thisisjava.ch18.num3.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        //문자 입출력 스트림 writer
        try {


            Writer writer = new FileWriter("C:/Temp/test.txt",true);
            //1문자씩 출력
            char c = 'A';
            char c2 = 'B';
            char c3 = 'C';
            writer.write(c);
            writer.write(c2);
            writer.write(c3);

            //char배열 출력
            char carr[] = new char[]{'A','B','C','D','E'};
            writer.write(carr);
            //문자열 출력
            writer.write("지승우입니다.");

            //버퍼에 잔류하고있는 문자들을 출력하고 버퍼를 비움
            writer.flush();

            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
