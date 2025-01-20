package thisisjava.ch18.num9.FileExample;

import java.io.File;

public class FileExample2 {
    public static void main(String[] args) throws Exception{
        //내가 만든 예제
        //C드라이브에 Test폴더와 그안에 music 폴더를 만들고 그 안에다 file1,2,3이라는 각각 txt,dat,db 파일을 만드시오

        File dir = new File("C:/Test/music");
        File file1 = new File("C:/Test/file1.txt");
        File file2 = new File("C:/Test/file2.dat");
        File file3 = new File("C:/Test/file3.db");
        
        //mkdirs() 모든 디렉터리를 생성 (존재하지 않는다면)
        //mkdir() 마지막부분에오는 디렉터리를 생성(앞에 디렉터리 존재x 일시 예외발생)
        if (dir.exists() == false){dir.mkdirs();}
        if (file1.exists() == false){file1.createNewFile();} //이코드는 디렉터리가없을상황
        //을대비해 예외를 발생시키는 코드를 갖고있음 예외처리를 해야함
        if(file2.exists() == false){file2.createNewFile();}
        if(file3.exists() == false){file3.createNewFile();}

        //Test폴더의 내용을 출력 exits()값이 true일 경우
        File test = new File("C:/Test");
            //File[] listFiles() 디렉터리에 포함된 파일 및 서브 디렉토리목록을 File배열로 리턴
            File[] files = test.listFiles();
        System.out.println(files.length);

        //list()메서드 파일 및 서브 디렉토리 파일 전부를 string배열로 리턴
        String[] strlist = test.list();
        for (String s: strlist){
            System.out.println(s);
        }




    }

}
