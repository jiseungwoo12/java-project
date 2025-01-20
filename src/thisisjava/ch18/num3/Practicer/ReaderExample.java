package thisisjava.ch18.num3.Practicer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        //reader와 writer는 메인메소드에서 실행이 두번겹치면 안되므로 따로따로 분리해주어야한다.
        try{
            Reader reader = new FileReader("C:/Temp/지승우.txt");
            //문자하나씩 읽어오기
            while (true){
                int data = reader.read();
                if(data == -1)break;
                System.out.print((char)data);
            }
            System.out.println();
            //스트림은 재사용이 불가하므로 다시 객체를 생성해야한다.
            reader = new FileReader("C:/Temp/지승우.txt");

            //문자배열로 읽어오기 많은양을 읽어올때 사용한다
            char[] data = new char[100]; //한번에 100개의 문자를 읽어옴
            while(true){
                int num = reader.read(data); //읽은 개수를 num에 저장
                if (num == -1)break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
