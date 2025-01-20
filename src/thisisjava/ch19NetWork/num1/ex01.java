package thisisjava.ch19NetWork.num1;

import java.io.IOException;
import java.net.InetAddress;

public class ex01 {
    public static void main(String[] args) {
        
        //네트워크 1장 ip주소얻기에 대한 방식을 알아보자
        //InetAddress로 표현한다.
        //InetAddress를 사용하면 로컬 컴퓨터의 Ip주소를 얻을수있고
        //도메인 이름으로 DNS에서 검색한후 ip 주소를 가져올수도있다.

        //InetAddress의 getLocalHost()메서드. 정적메소드임
        try {
            InetAddress ia = InetAddress.getLocalHost();//예외발생 예외처리해주기
            System.out.println("내 컴퓨터 ip주소 :"+ ia.getHostAddress());
            //컴퓨터의 도메인이름을 알고싶다면 getByName 메서드나 (하나의 ip주소만 받기)
            //getAllByName()메서드를 사용해서얻는다 (전체의 ip주소값을 배열로받기)
            InetAddress ia2 = InetAddress.getByName("www.naver.com");
            System.out.println("네이버의 ip주소: "+ia.getHostName());
            InetAddress [] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaArr){
                System.out.println("네이버의 모든 아이피 주소 \n"+remote.getHostAddress()+" ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
