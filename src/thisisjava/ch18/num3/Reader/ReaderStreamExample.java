package thisisjava.ch18.num3.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderStreamExample {
    public static void main(String[] args) {
        //reader추상클래스도 마찬가지로
        //read()메서드로 읽을수있는데 read()메서드를 사용하면 1개의 문자를 읽고 리턴한다
        //int data에 리턴한다는 의미 data를 print하면 리턴된 문자를 프로그램에서 출력한다.
        try{
            Reader reader = new FileReader("C:/Temp/test.txt");
            while(true){
                int data = reader.read();
                if(data == -1)break;
                System.out.print((char)data);
            } //while의 끝
            reader.close();
            System.out.println();

            //문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while(true){
                //num에는 몇개의 문자를 읽었는지 개수
                int num = reader.read(data); //읽은문자는 데이타 배열에 저장
                if (num==-1)break;
                for (int i = 0; i < num; i++) { //읽은수 num값까지 for문을반복
                    System.out.print(data[i]);  //데이타 배열에 0~읽은수 반복해서 출력
                }
                
            }

        }//try의 끝
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
