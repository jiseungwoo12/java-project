package thisisjava.ch18.num5.BufferedStream;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) {
        //이번에는 전에 BufferedReader를 사용하여
        //한 행씩 문자를 읽어온걸 기억해보아라
        //버퍼리더라는것은 한행을 버퍼에저장하고 readline()이란 메서드로 한번에 출력해준다.
        try {
            InputStream is = new FileInputStream("C:/Temp/테스트.txt");
            //왜 뜬금없이 reader객체를만드느냐?
            //BufferedReader는 생성자값에 Reader만 들어갈수있기때문이다.
            //그리고 InputStreamReader는 Reader를 상속받은 클래스이고
            //InputStreamReader는 생성자값에 InputStream만 들어올수있는 변환기이다.
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);
            while (true){
                String read = br.readLine();
                //문자가아닌 바이트값에선 읽을수없는 값이 되었을시 -1을 리턴하지만
                //행단위로 읽어오는 문자에서는 null을 리턴한다.
                if (read == null)break;
                System.out.println(read);
            }
                br.close();
            //이렇게 보조스트림을 종료하면 보조스트림말고 메인스트림들은 모두 닫힌다.
            //위에 파일을 Writer로 테스트2.txt파일로 복사하고 다시 읽어보자
            BufferedReader br1 = new BufferedReader(new FileReader("C:/Temp/테스트.txt"));
            Writer writer = new FileWriter("C:/Temp/테스트2.txt");
            BufferedWriter bw = new BufferedWriter(writer);
            while(true){
                String data = br1.readLine();
                if (data == null)break;
                bw.write(data+"\n");
            }
            bw.flush();
            bw.close();
            br1.close();

            
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
