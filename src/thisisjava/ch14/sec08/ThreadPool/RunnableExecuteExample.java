package thisisjava.ch14.sec08.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
    public static void main(String[] args) {

        //1000개의 메일생성
        String[][] mails = new String[1000][3];

        for (int i = 0; i < mails.length; i++) { //mails.length는 [1000]을 의미 1000번돈다는
            mails[i][0] = "admin@naver.com";
            mails[i][1] = "member"+i+"@my.com";
            mails[i][2] = "신상품 입고";
        }
        //ExecutorService 인터페이스 객체생성
        //스레드풀의 작업스레드를 5개로 고정,.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //이메일을 보내는 작업 생성 및 처리 요청
        for (int i = 0; i < 1000; i++) {
            final int idx = i; //익명자식객체는 로컬변수나 매개변수에서 값을 변경하지못한다는 점
            //때문에 final로 선언한다.
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    System.out.println("["+ thread.getName()+"]"+from+ " == >" +
                            to + ": "+ content);
                }
            });
        }
        //스레드 풀 종료
        executorService.shutdown();




    }
}
