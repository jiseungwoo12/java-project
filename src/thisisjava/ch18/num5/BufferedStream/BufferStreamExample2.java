package thisisjava.ch18.num5.BufferedStream;

import java.io.*;

public class BufferStreamExample2 {
    public static void main(String[] args) {
        //읽어올 파일경로
        String originalFile = BufferStreamExample2.class.getResource("original.jpg").getPath();
        String originalFile2 = BufferStreamExample2.class.getResource("original2.jpg").getPath();
        //복사할 파일경로
        String targetFile = "C:/Temp/copyFile1.jpg";
        String targetFile2 = "C:/Temp/copyFile2.jpg";
        //복사할 파일경로

        try {
            //버퍼가없는 스트림
            InputStream is = new FileInputStream(originalFile);
            OutputStream os = new FileOutputStream(targetFile);
            //버퍼가 있는 스트림
            InputStream is2 = new FileInputStream(originalFile2);
            OutputStream os2 = new FileOutputStream(originalFile2);
            BufferedInputStream bis = new BufferedInputStream(is2);
            BufferedOutputStream bos = new BufferedOutputStream(os2);

            //각 시간 측정
            long nonBufferedTime = copy(is,os);
            System.out.println("버퍼 미사용:\t"+nonBufferedTime+"ns");

            long BufferedTime = copy(bis,bos);
            System.out.println("버퍼 사용:\t"+BufferedTime+"ns");



        }catch (Exception e){
            e.printStackTrace();
        }

        //버퍼가있는 스트림
    }

    //측정시간을 재기위한 copy메서드
    public static long copy(InputStream is, OutputStream os) throws Exception{
        long start = System.nanoTime();
        while(true){
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();

        return end-start;
    }

}
