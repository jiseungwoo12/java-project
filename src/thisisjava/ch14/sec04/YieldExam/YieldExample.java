package thisisjava.ch14.sec04.YieldExam;

public class YieldExample {
    public static void main(String[] args) {

        YiledThread yiledThreadA = new YiledThread("mythreadA");
        YiledThread yiledThreadB = new YiledThread("mythreadB");

        yiledThreadA.start();  //실행대기 상태
        yiledThreadB.start();  //실행대기상태.

        try {
            Thread.sleep(5000);   //메인스레드를 잠재우기.
        }catch (InterruptedException e){}
        yiledThreadA.work = false;

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        yiledThreadA.work = true;

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}
//        yiledThreadA.stop();
        yiledThreadA.work = false;
        yiledThreadB.work = false;






    }
}
