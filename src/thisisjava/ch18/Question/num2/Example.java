package thisisjava.ch18.Question.num2;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //원본 파일경로와 복사파일 경로를 입력받고 원본 파일을 복사하는 프로그램을 만들어보세요
        //바이트 기반스트림과 성능 향상 보조 스트림을 반드시사용
        Scanner scanner = new Scanner(System.in);
        System.out.println("원본 파일경로 입력");
        String originalFile = scanner.nextLine();
        System.out.println("복사 파일경로 입력");
        String copyFile = scanner.nextLine();

        File fileorigin = new File(originalFile);
        File filecopy = new File(copyFile);

        if (!fileorigin.exists()){
            System.out.println("원본 파일이 존재하지않습니다");
            return;
        }
        File parentDir = filecopy.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
            System.out.println("상위 디렉터리가 없으므로 생성했습니다.");
        }
        try{
            //입력받은 파일을 읽고
            FileInputStream fis = new FileInputStream(fileorigin);
            //성능향상 보조스트림을 장착
            BufferedInputStream bis = new BufferedInputStream(fis);
            //출력할 스트림도 같은방식으로 생성
            FileOutputStream fos = new FileOutputStream(copyFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            while (true){
                int data = bis.read();
                if (data == -1)break;
                bos.write(data);
            }
            bos.flush();
            System.out.println("복사가 성공하였습니다.");
            fis.close();
            fos.close();
            bis.close();
            bos.close();


        }catch (Exception e){
            e.printStackTrace();
        }





    }

}
