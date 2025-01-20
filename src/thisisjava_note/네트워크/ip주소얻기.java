package thisisjava_note.네트워크;

import java.io.IOException;
import java.net.*;

public class ip주소얻기 {
    public static void main(String[] args) {

        try {
            //InetAddress를 얻는 메서드
            InetAddress inetAddress = InetAddress.getLocalHost();
            InetAddress ia = InetAddress.getByName("www.naver.com");
            InetAddress iaarr[] = InetAddress.getAllByName("www.naver.com");

            String ip = ia.getHostAddress();
            System.out.println(ip);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
