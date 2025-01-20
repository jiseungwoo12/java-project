package thisisjava.ch14.sec06.ThreadStop;

public class StopExample {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();

        stopThread.start();
        try {
            Thread.sleep(3000);  //3초동안 잠들었다가.
        }catch (InterruptedException e){} 
        stopThread.setStop(true);  //setStop으로 스탑문을 true로 변경


    }

}
