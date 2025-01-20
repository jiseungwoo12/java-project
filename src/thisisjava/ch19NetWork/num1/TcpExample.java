package thisisjava.ch19NetWork.num1;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpExample {
    public static void main(String[] args) throws Exception{
        //이번시간에는 TCP에 대해 알아본다.
        //TCP는 전송용 프로토콜로 (연결형 프로토콜이다.)
        //상대방이 연결된 상태에서 데이터를 주고받는다.
        //클라이언트(내PC)가 연결요청을하고 서버가 연결을수락하면
        //통신회선이 고정되고 데이터는 고정회선을 통해 전달된다.
        //그렇기 때문에 TCP는 보낸 데이터가 순서대로 전달되며 손실이 발생하지않는다.
        //TCP는 IP와 함께 사용되기 때문에 TCP/IP라고도 한다.
        //웹브라우저, 이메일전송, 파일전송,DB전송 에도사용된다 거의대부분 TCP

        //자바는 TCP네트워킹을 위해 java.net 패키지에서
        //Serversocket과 Socket 클래스를 제공하고있다,.
        //ServerSocket은 클라이언트의 연결을 수락하는 서버쪽 클래스이고
        //Socket은 클라이언트에서 연결요청할때와 클라이언트와 서버양쪽에서 데이터를 주고받을때 사용한다.

        //ServerSocket을 생성할때는 바인딩할 포트번호를 지정해야한다

        ServerSocket serverSocket = new ServerSocket(50001);

        //ServerSocket이 생성되었다면 연결요청을 수락하기위해 accept()메서드를 실행해야한다
        //accept는 클라이언트가 연결 요청하기전까진 블로킹된다.
        //이렇게되면 서버객체안에 소켓이 생성된것이나 다름없다
        //서버안에 소켓이 생성되면 클라이언트의 소켓과 데이터를 주고받을수있고
        //ip 주소 port번호까지 얻을수있다.
        Socket socket = serverSocket.accept();

        //ip주소와 port번호 얻기
        //getRemoteSocketAddress() 소켓에 저장된 ip와 포트번호를 반환
        InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
        String ipAddress = isa.getHostString();
        int portNo = isa.getPort();

        serverSocket.close();


    }
}
