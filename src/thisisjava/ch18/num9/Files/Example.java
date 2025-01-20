package thisisjava.ch18.num9.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        //Files클래스는 java.nio.file.files에 위치한다
        //files클래스는 정적메소드만으로 이루어져있고
        //이 메소드들의 매개값으로는 Path객체를 받는다.
        //Path파일객체는 파일이나 디렉토리를 찾기위한 경로 정보를 가지고있는데
        //정적 메소드인 get() 메소드로 다음과 같이 얻을수있다.
        //get()의 매개값으론 경로를 가변길이로 받을수있으므로 다음과 같이 작성가능하다.
        Path path = Paths.get("C:/Temp/dir/file.txt");
        Path path1 = Paths.get("C:/Temp/dir","file.txt");
        Path path2 = Paths.get("C:/","Temp","dir","file.txt");

        //파일의 경로는 절대 경로와 상대 경로를 모두 사용할수있다.
        //만약 현재 디렉토리가 C:/Temp 일경우 C:/Temp/dir/file.txt는 다음과 같이 지정이가능하다.
        Path path3 = Paths.get("dir/file.txt");
        Path path4 = Paths.get("./dir/file.txt");
        //C:/Temp/dir/dir2/file2.txt 는 ..을붙여서 상위디렉토리를 표시한다 .하나당한개
        Path path5 = Paths.get("../dir2/file.txt");

        //하지만 이런 사용방식은 권장되지않는다.
//        Java 코드로 작업 디렉터리를 변경하려면 System.setProperty를 사용해야 합니다. 
//        하지만 이는 권장되지 않으며, 대신 경로를 명시적으로 사용하는 것이 좋습니다.
        //명시적으로 쓰자


    }
}
