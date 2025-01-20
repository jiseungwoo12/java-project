package thisisjava.ch18.num5.BufferedStream;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;

public class BufferExample {
    public static void main(String[] args) {
        try {
            // original.jpg의 절대 경로 얻기
            String originaljpg = BufferExample.class.getResource("original.jpg").getPath();
            originaljpg = URLDecoder.decode(originaljpg, "UTF-8"); // 경로 디코딩
            System.out.println("원본 파일 경로: " + originaljpg);

            // 현재 클래스가 있는 디렉토리 경로 얻기
            String directoryPath = null;
            URL directoryURL = BufferExample.class.getResource("");
            if (directoryURL != null) {
                directoryPath = directoryURL.getPath();
                directoryPath = URLDecoder.decode(directoryPath, "UTF-8"); // 경로 디코딩
            }

            // 복사본 파일 경로 생성
            String copyFilePath = directoryPath + "copy.jpg";
            System.out.println("복사 파일 경로: " + copyFilePath);

            // 파일을 읽기
            InputStream is = new FileInputStream(originaljpg);
            // 복사본 파일 출력 스트림
            OutputStream os = new FileOutputStream(copyFilePath);

            // 파일 복사
            while (true) {
                int data = is.read();
                if (data == -1) break;
                os.write(data);
            }

            os.flush();
            is.close();
            os.close();

            // 파일 생성 확인
            File outputFile = new File(copyFilePath);
            if (outputFile.exists()) {
                System.out.println("파일 복사 완료: " + outputFile.getAbsolutePath());
            } else {
                System.out.println("복사본 파일 생성 실패");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
