package thisisjava.ch18.num3.Practicer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Reader_WriterExample {
    public static void main(String[] args) {
        //C에 Temp 디렉토리에 지승우.txt 파일을 생성하고
        //1 지승우는 개발자입니다.
        //2 A B C D E F G 를 문자로 저장하시오
        //그리고 출력하시오
        try{                                                        //append false는 새로운파일로만듬
            Writer writer = new FileWriter("C:/Temp/지승우.txt",false);
                char c[] = new char[]{'A','B','C','D','E','F','G'};
                writer.write("지승우는 개발자입니다.");
                writer.write("\n");  //줄바꿈
                writer.write(c);
                writer.flush();
                writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
