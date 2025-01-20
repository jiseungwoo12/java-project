package thisisjava.ch18.num4.보조스트림;

import java.io.*;

public class Incoding_Decoding {
    public static void main(String[] args) {
        //이 예제는 test.txt라는 파일(문자로만 구성된 파일)
        //을 만들고(Ji seung woo is best developer) 읽겠다.
        //근데 OutputStream으로 파일을 만들고? inputStream으로만 파일을 읽는다?
        //일단 한번해보자
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test.txt");
            String str = "Ji seung woo is best developer";
            //OutputStream은 바이트를 버퍼에 담아 출력시키는 메서드
            //os.write() 이있다 하지만 write는 1바이트씩 버퍼에 담는것으로 문자열을 담을수없다
            //따라서 문자열 -> 바이트코드로 변환시켜야한다. 이를 인코딩이라한다.
            byte[] data = str.getBytes("UTF-8");  //String클래스의 getBytes()메서드를
            //이용하면 문자열을 바이트 배열로 반환해준다.
            os.write(data);
            os.flush();
            //뭔가 딱봐도 되게 가독성이 안좋고 코드량이 많아져 복잡해진다.

        }catch (IOException e){
            e.printStackTrace();
        }
        //일단 이 예제에서는 문자열을 바이트배열로 바이트배열을 문자열로 인코딩 디코딩을해보자
        try {
            InputStream is = new FileInputStream("C:/Temp/test.txt");
            //InputStream도 마찬가지로 1바이트씩 스트림을 읽어오는 것이기때문에 이 txt파일에 저장된
            //문자열을 디코딩하여 바이트 배열로 변경시켜야한다.
            //UTF-8기준으로 한글은 한글자당 3바이트이므로 넉넉하게 100을 읽을수있게정해준다.
            byte[] data = new byte[100];
            int num = is.read(data);
            String str = new String(data,0,num);
            System.out.println(str);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
