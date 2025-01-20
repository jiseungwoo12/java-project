package thisisjava.ch18.num3.Practicer;

import java.io.*;

public class ReaderCopyWriter {
    public static void main(String[] args) {
        //이번에는 내가 Temp디렉토리에만든 테스트.txt파일을 읽고
        //테스트2.txt파일로 출력하는 과정을 알아보자
        try{
            Reader reader = new FileReader("C:/Temp/테스트.txt");
            Writer writer = new FileWriter("C:/Temp/테스트2.txt");
            //while문으로 모든 문자를 읽어 저장한다.
            char data[] = new char[100]; //100문자씩 읽어서 저장
            while (true){
                int num = reader.read(data);
                if (num == -1)break; //읽어올게 없을때까지 읽어서 data배열에저장시킨다.
                writer.write(data); //읽어온 100문자를 write버퍼에 저장한다. 어디에 테스트2.txt파일에
            }
            //while문으로 write를 모두 버퍼에 저장하였으면 flush()메서드를 이용해 출력한다.
            writer.flush();
            reader.close();
            writer.close();
            //이렇게 종료메서드를 작성하고 실행할시
            //테스트2.txt파일로 잘 복사된것을 확인할수있다.

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
