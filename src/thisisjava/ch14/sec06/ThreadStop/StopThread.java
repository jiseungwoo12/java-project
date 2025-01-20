package thisisjava.ch14.sec06.ThreadStop;

public class StopThread extends Thread{
    private boolean stop;  //boolean의 기본값은 false

    public void setStop(boolean stop){
        this.stop = stop;
    }



    @Override
    public void run(){
        while (!stop){ //!stop true이므로 무한반복상태
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행종료");
    }

}
