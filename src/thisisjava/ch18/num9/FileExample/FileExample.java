package thisisjava.ch18.num9.FileExample;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        //File클래스
        //File클래스로부터 객체를 생성하는 방법
        //File file = new File("경로");
        //파일 객체를 생성했다고해서 파일이나 디렉토리가 생성되는것이아니라
        //파일객체를 생성해 파일클래스에잇는 메서드를 사용해 생성하거나 수정, 정보를읽기
        //등등을 할수있다.
        //그리고 이러한 이유때문에 경로에 실제 파일이나 디렉터리가없어도 예외가 발생하지않는다
        

        //윈도우는 구분자 /이나 \\를 둘다 사용가능하다 (둘중에하나)

            File file = new File("C:/Test/file.txt");
            //File은 아까말했듯이 path경로가 없어도 예외를 발생시키지않는다.
        //파일이나 디렉토리의 여부 확인
        try {

            if (file.exists()) {
                System.out.println("있습니다.");
            } else { //없다면? false 다음메서드로
                //파일또는 폴더를 생성할수있다.

                file.createNewFile(); //이코드는 파일이없다면 생성해주는코드인데
                //한마디로 디렉터리(폴더)가 아닌 txt,java,db,dat 이런 읽고쓸수있는 파일을 만든다.
                //왜 예외가 발생할까 Test라는 디렉터리도 없기때문이다. 만들어주자
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
