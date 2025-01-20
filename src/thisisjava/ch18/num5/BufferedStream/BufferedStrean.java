package thisisjava.ch18.num5.BufferedStream;

import java.io.*;

public class BufferedStrean {
    public static void main(String[] args) {
        //성능 향상 스트림을 사용했을때랑 사용하지않았을때의
        //실행 속도 차이를 보여주는 예제를 만들자
        String original = BufferedStrean.class.getResource("original.jpg").getPath();
        String copyjpg = "C:/Temp/copy.jpg";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(copyjpg);
            BufferedInputStream bi = new BufferedInputStream(is);
            BufferedOutputStream bo = new BufferedOutputStream(os);
        long time = copy(is,os);
        long time2 = copy(bi,bo);
            System.out.println(time);
            System.out.println(time2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static long copy(InputStream is,OutputStream os) throws Exception{
        long start = System.nanoTime();
        while (true){
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return end-start;
    }
}
