package thisisjava.ch18.num9.FileExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ExampleTest1 {
    public static void main(String[] args) throws Exception{
        //File클래스의 메서드 목록

        //exists() //파일이나 디렉터리가 존재한다면 true를 리턴
        //if문으로 검사할때 많이사용
        //createNewFile() 경로를 주었을때 경로처럼 파일이없다면 파일을 생성
        //exists으로 파일이있는지 검사하며 사용
        //mkdir() 경로를 주었을때 경로처럼 디렉터리가없다면 디렉터리 생성
        //예) c:/wltmddn/music/music.mp3 일때 music이란 끝에 없는 디렉터리만 생성한다
        //IOException 전부다없을경우 이예외를 발생시킨다.
        //mkdirs() 경로상에 없는 모든 디렉토리를 생성

        //예) c:/wltmddn3/music/music.mp3 나는 이 디렉터리와 파일을 생성하고싶다?
        //그러면
        //먼저 파일 객체를 이경로로 설정한후(파일객체는 이경로가 없어도 예외 발생x)
        File file = new File("C:/wltmddn3/music");
        if (file.exists()==false) { //경로가없다면
            file.mkdirs();  //없는  디렉토리를 모두 생성
        }
        try {
            //입출력스트림에다 생성자에 file객체를 끼워넣기
            //파일은 보통 빈파일만을 만들진않고 OutputStream으로 파일객체의 경로를 제공받아
            //출력스트림으로 파일을 만든다.
            File file2 = new File("C:/wltmddn3/music/wltmddn.mp3");
            OutputStream os = new FileOutputStream(file2);
            os.flush(); os.close();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
