package thisisjava.ch14.sec04.Joinexamp2;

import thisisjava.ch14.sec04.Joinexamp.JoinThread;

public class Joinexam2 {
    public static void main(String[] args) {
        //JoinThread 안에 필드가있으니 Runnable객체로 값을 받으면 사용하지못하기때문에
        //구현한 클래스로 객체를 생성해준다.
            JoinThread joinex = new JoinThread();
            //이 Runnable을 구현한 클래스는 이렇게 먼저 구현한객체를 생성하고
            Thread thread = new Thread(joinex); //스레드객체를 생성해 객체값을입력받아야한다.
            thread.start();  //실행 대기상태로간다.
            //마찬가지로 조인메서드는 예외처리 해주기
        try {
            thread.join();
        }
            catch (InterruptedException e){}  //이 join()메서드를 사용하지않으면 0값이출력됨.
        //join메서드를 사용하는 이유가 위에 for문 스레드를 전부 실행시킨다음에 합을 구하는 예제라서
        //
        System.out.println("1부터 100까지의 합 :"+ joinex.getSum());

        //이렇게 스레드를 상속한클래스보다 Runnable을 구현한 클래스를 사용하기 더까다롭다.

    }
}
