package thisisjava.ch14.sec07;

public class DaemonExample {
    public static void main(String[] args) {
        //데몬 스레드는 스레드의 보조스레드 역할로
        //메인스레드를 주스레스 메인스레드를 보조하는 데몬스레드로 나눌수있다.
        AutoSaveThread thread = new AutoSaveThread(); //스레드 객체생성

//        thread.start();  //
//        System.out.println("메인스레드 종료");
        //이처럼 데몬스레드를 선언하지않으면
        //메인스레드가 종료되어도 일반스레드는 종료되지않는다.
        //파일자동저장기능과같은 특성은 메인스레드 즉 워드프로세서 같은 프로세서가종료되면 함께
        //저장기능이 함계종료가 되는것이 아닌 살아있는 상태가되어 에러를 발생시킨다.

        //하지만 데몬스레드를 선언하여 해결해보자
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(3000);

        }catch (InterruptedException e){}
        System.out.println("메인 스레드 종료");

        //이렇게하면 메인스레드와 같이 프로그램이종료된다,.
    }
}
