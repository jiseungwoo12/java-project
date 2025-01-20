package thisisjava.ch14.sec04.YieldExam;

public class YiledThread extends Thread{

    public boolean work = true;

    public YiledThread(String name){
        setName(name);
    }



    @Override
    public void run(){
        while(true){  //무한반복
            if (work){  //work가 true일시
                System.out.println(getName() + "일처리");  //스레드의 이름을출력
            }else {
                Thread.yield();  //다른 스레드에게 실행양보.
            }   
        }
    }
}
