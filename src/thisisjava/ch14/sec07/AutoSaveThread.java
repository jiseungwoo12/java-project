package thisisjava.ch14.sec07;

public class AutoSaveThread extends Thread{
        //데몬스레드 예제
    public void save(){   //워드프로세서,한글과같은 자동저장기능을 위한 메서드를 구현해보자.
        System.out.println("작업내용 저장");
    }

    @Override
    public void run() { 
        while (true) {   //무한반복저장
            try {
                Thread.sleep(3000);  //3초마다잠든다.


            } catch (InterruptedException e) { //예외가 발생하면 즉시종료
                break; 
            } //catch의끝
            save();  //적절한 시간이지나면 저장
        }  //while의 끝
    } //run의끝
}
