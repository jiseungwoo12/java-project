package thisisjava.ch18.num9.Files;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) {
        //C:/Temp 디렉토리에 user.txt 파일을 생성하고 읽는 방법을보여주는 예제
        try{
            String data =  " "+
                    "id: winter\n"+
                    "email: winter@mycompany.com\n"+
                    "tel: 010-123-1234";
            //Path객체 생성
            Path path = Paths.get("C:/Temp/user.txt");
            //파일 생성 및 데이터 저장
            //writeString()은 문자열을 문서에 저장한다
            //매개변수 1 Path.get()또는 만든 path경로, 2 넣을데이터, 인코딩방식(Charset.forname())
            Files.writeString(path,data, Charset.forName("UTF-8"));

            //파일 정보얻기
            System.out.println("파일 유형:"+ Files.probeContentType(path));
            //이때 파일유형의 prodeContentType메서드는 MimeType을 반환한다
            //text/prain 텍스트파일이고/ 일반텍스트 파일이라는뜻
            //image/jpg 이런식으로 나온다.
            System.out.println("파일 크기:"+ Files.size(path)+" bytes");

            //파일 읽기 이것도 write랑마찬가지로 읽을경로, 디코딩방식
            String content = Files.readString(path,Charset.forName("UTF-8"));
            System.out.println(content);




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
