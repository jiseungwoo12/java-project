package thisisjava.ch14.sec08.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        //자연수 1부터 100까지를 더하는 스레드 풀을 정의
        //스레드풀을 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //최대 5개의 스레드로 동작하는 스레드풀
        //계산 작업 및 처리요청
        for (int i = 0; i < 100; i++) {
            final int idx = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for (int i = 1; i <= idx; i++) {
                        sum += i;
                    }

                    Thread thread = Thread.currentThread();
                    System.out.println("["+thread.getName()+"]"+ idx + "합 계산");
                    return sum;
                }
            });
            try {
                int result = future.get();
                System.out.println("\t리턴값: "+result);
            }catch (Exception e){e.printStackTrace();}

        }
        //스레드풀 종료
        executorService.shutdown();


        
        
        
        
    }
}
