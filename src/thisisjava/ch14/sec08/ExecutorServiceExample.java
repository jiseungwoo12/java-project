package thisisjava.ch14.sec08;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        //이번 예제는 스레드풀의 생성방법을 알아본다.
        //ExecutorService라는 인터페이스에 Executors의 정적메서드인 newFixedThreadPool
        //Fixedpool 고정된 코어가 5개로고정된 스레드풀을 생성.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //작업 생성과 처리요청
        //스레드풀 종료
        //shutdown메서드 executorService인터페이스의 shutdown메서드사용.
        executorService.shutdown();
    }
}
