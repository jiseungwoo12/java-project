package thisisjava.ch14.sec04.Joinexamp;

public class JoinExample {
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
//        Thread thread = new Thread(joinThread);
        //이렇게 스레드 객체를 생성하지않아도 스레드클래스를 상속받은 객체를 사용할수있다.
        joinThread.start();  //상속받으면
        //join도 sleep과 같이 InterruptedException을 발생하기때문에
        //Api 도큐먼트에 들어가보면 이 예외는 일반예외 이므로 예외처리를 해야된다.
        try{
        joinThread.join();}
        catch (InterruptedException e){}

        System.out.println("1부터 100까지의 값의 합: "+ joinThread.getSum());
    }
}
