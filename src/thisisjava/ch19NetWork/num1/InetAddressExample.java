package thisisjava.ch19NetWork.num1;

import java.net.InetAddress;

public class InetAddressExample {
    public static void main(String[] args) {
        //자바는 ip주소를 java.net 패키지의 InetAddress로 표현한다
        //Ineta

        //getByAddress 도메인이름으로 ip값을 가져온다 하나만
        try {
            //내 컴퓨터 주소값을 얻어오는법 getLocalHost();
            //아이피값만 출력하는법 getHostAddress()인스턴스메서드
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("나의 아이피: "+local.getHostAddress());
        //getByName은 도메인이름값으로 ip주소값을 얻어온다
            //DNS를 이용한 코드다
        InetAddress ia = InetAddress.getByName("www.google.com");
        //getAllByName 도메인이름값으로 된 모든 ip주소값을 받아온다.
            InetAddress [] iaarr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaarr){
                System.out.println(remote.getHostAddress());

            }
        }catch (Exception e){e.printStackTrace();}
    }
}
