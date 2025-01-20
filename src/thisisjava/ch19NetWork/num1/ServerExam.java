package thisisjava.ch19NetWork.num1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam {
    //main에서 바로 사용하기위해 static으로선언
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 엔터키를 입력하세요");
        System.out.println("----------------------------------------------------");

        //TCP 서버 시작
        startServer();

        //키보드 입력
        Scanner scanner = new Scanner(System.in);
        while (true){
            String key = scanner.nextLine();
            //대소문자 구분없이 q를 입력하면 while문 종료
            if(key.toLowerCase().equals("q")){
            break;}
        }
        //24시간 돌아가는 프로그램에서는 close()해주는것이 좋다.
        scanner.close();
        //TCP 서버 종료
        stopServer();
    }
    //q를 입력해서 서버를 종료하는 작업 하나
    //서버를 시작하는 작업하나
    //서버를 종료하는 작업하나를 모두 사용하기위해선 스레드를 구현해야한다.
    public static void startServer(){
        //작업스레드 정의 (스레드의 자식 클래스를 만들어 객체 생성)
        Thread thread = new Thread(){
            @Override
            public void run(){
                //서버소켓 생성 및 포트 바인딩
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");
                    while(true){ //연결요청이 들어오면 수락해주는 작업을 반복
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        //연결수락
                        Socket socket = serverSocket.accept();
                    //연결된 클라이언트 정보 얻기
                        InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
                        String ip = isa.getHostName();
                        System.out.println("[서버] 연결된 IP :" +ip);
                    }


                }catch (IOException e){
                    System.out.println("[서버] "+e.getMessage());
                }
            }
        };
        //스레드 시작
        thread.start();
    }
    public static void stopServer(){


    }
}
