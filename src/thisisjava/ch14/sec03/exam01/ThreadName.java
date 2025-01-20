package thisisjava.ch14.sec03.exam01;

import thisisjava.ch14.sec02.exam03.Task;

import java.sql.SQLOutput;

public class ThreadName {
    public static void main(String[] args) {
        //메인메서드의 스레드 이름값 알아보기
        //currentThread()는 스레드클래스의 정적메서드이다.
        //뜻은 현재 이코드를 실행하는 쓰레드의 참조를 얻는다.
        Thread mainthread = Thread.currentThread();
        //getName()을 통해 스레드의 이름을 알아낸다.
        System.out.println(mainthread.getName());


        Thread thread = new Thread(new Task());
        System.out.println(thread.getName());  //thread에는 get

    }
}
