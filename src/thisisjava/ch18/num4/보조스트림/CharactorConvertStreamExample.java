package thisisjava.ch18.num4.보조스트림;

import java.io.*;

public class CharactorConvertStreamExample {
    public static void main(String[] args) {
        //이번에는 아까전에 인코딩 디코딩으로
        //보조스트림을 달지않고 하나의 IOstream으로만 문자를 처리했엇다
        //이번에는 보조스트림을 달아서 문자를 입출력해보자.

        try{
            //어떤 이유에선지 문자열을 담은 txt파일을 OutputStream으로 생성하고자한다면?
            OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
            //보조 스트림달기 문자 변환 스트림 OutputStreamWriter
            //OuptutStreamWriter는 Writer의 자식객체기때문에 Writer에도담을수있다
            Writer writer = new OutputStreamWriter(os,"UTF-8");
            String str = "보조스트림을 이용하여 문자열 생성";
            //Writer클래스는 아까 말했듯이 write(문자열,char배열, 문자) 이렇게 매개변수값에 쓸수잇다.
            writer.write(str);  //아까 보조스트림을 달지않고
            writer.flush();
            writer.close();
            //OutputStream에 바이트배열로 인코딩하여 출력시켰지만
            //여기서는 OutputStream을 Writer로 변환시켜 넣고자하는 문자열을 금방 넣을수있게만들었다.
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            //이번에도 InputStream에 보조스트림을 달아줘서
            //Reader객체로 내용을 읽도록해보겠다
            InputStream is = new FileInputStream("C:/Temp/test2.txt");
            Reader reader = new InputStreamReader(is);
            //이 Reader객체의 read()는 하나의문자로 읽고 문자배열로 읽는다.
            char[] c = new char[100]; //넉넉하게 한번에 100문자를 읽어서 char배열에 저장한다.
            //int num은 실제로 읽은 문자수를 리턴한다.
            int num = reader.read(c); //reader객체는 문자를 읽고 문자배열에 저장한다
            reader.close();
            String str = new String(c,0,num);
            System.out.println(str);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
