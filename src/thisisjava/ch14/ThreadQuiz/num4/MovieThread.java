package thisisjava.ch14.ThreadQuiz.num4;

public class MovieThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("동영상을 시작합니다.");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
