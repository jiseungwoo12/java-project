package thisisjava.ch14.sec06.InterruptExam;

public class PrintThread extends Thread{


    @Override
    public void run() {
//        try {
            while (true) {
                System.out.println("실행중 ...");
//                Thread.sleep(1);
                //일시정지상태로 만드는것이아닌
//                if (Thread.interrupted()) {  //방해되어졌느냐 (interrupt가 사용이됬느냐)
//                    break; }  //정적메서드 interrupted() 로 break
                //방법2
                if(isInterrupted()){  //똑같이 interrupt라는 메서드가 호출됬을시 break
                    break;
                }


            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
                System.out.println("리소스 종료");
                System.out.println("실행 종료");

    }

}
