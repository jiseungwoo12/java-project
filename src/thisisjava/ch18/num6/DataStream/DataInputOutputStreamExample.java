package thisisjava.ch18.num6.DataStream;

import java.awt.image.DataBufferInt;
import java.io.DataInputStream;
import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) {
        // Data입출력스트림을 바이트스트림(입출력스트림)에 연결하면
        //기본타입입 boolean byte short int double char String값을 입출력할수있다
        //DataInputStream과 outputStream은 각각
        //생성자값에 InputStream과 outputStream에다가만 연결가능하므로
        //Reader와 Writer에는 연결할수가없다는 것을 알수있다.
        //가지고있는 메서드
        //readxxx()
        //이 메소드를 통해 입출력할때 한가지 주의점이있다.
        //데이터 타입의 크기가 모두 다르므로 출력한데이터를 읽어올경우에는
        //출력한 순서와 동일한 순서로 읽어와야한다.
        //예 int-boolean-String  // int - boolean - String
        //동일한 순서로 읽어오는것

        //그럼 이제 문자열(이름) double(점수) int(등수) 식으로 출력을먼저해보자
        try {
            FileOutputStream fo = new FileOutputStream("C:/Temp/테스트2.txt");
            DataOutputStream dos = new DataOutputStream(fo);
                   dos.writeUTF("지승우");
                   dos.writeDouble(95.5);
                   dos.writeInt(1);

                   dos.writeUTF("김채원");
                   dos.writeDouble(90.1);
                   dos.writeInt(2);


                   //읽을때도 순서는 출력할때 순서랑 같아야한다
            FileInputStream fi = new FileInputStream("C:/Temp/테스트2.txt");
            DataInputStream dis = new DataInputStream(fi);
            for (int i = 0; i < 2; i++) {
                String name = dis.readUTF();
                double score = dis.readDouble();
                int num = dis.readInt();
                System.out.println("이름:"+name+ "\t 점수:"+score+"\t등수:"+num);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
