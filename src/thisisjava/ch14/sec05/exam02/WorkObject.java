package thisisjava.ch14.sec05.exam02;

public class WorkObject {
    //이번엔 싱크로나이즈(동기화)를 이용해 wait()과 notify()를 사용해보겠다.
    //wait()과 notify()는 각각 정지,다시실행 이라는 성질을 가지고있다.
    //wait을하면 다른스레드의 (start()메서드)를호출한,main스레드의 내용을 호출하게된다.
    //wait은 이처럼 이것을 실행한 메서드가 잠시 쉬고 다른스레드를 호출하겠다는의미이다.
    //wait(int millssecond) 같은 wait메서드는 시간을 입력하고 그 시간이 지나면 다시 스레드가
    //실행되지만 매개변수값이없는 wait()메서드는 notify메서드를이용해 재개해주어야한다.
    //wait과 notify는 동기화와 무슨 연결성?
    //동기화를통해 wait과 notify를 for문으로 돌려보면 a,b,a,b,a,b,a,b 같은 반복적인형태로
    //실행을한다 . 스레드는 운영체제의 코어로 돌아가는것이기때문에 반복적이지않고 a가2번 b가 2번
    //따로 실행될수있다. 그래서 동기화를하고 a메서드 b메서드를 구분짓게만든다.

    //이 메서드는 동기화된메서드이다.
    public synchronized void methodA(){
        //먼저 스레드객체의 정보를 가져온다.
        //.. 여기서부터
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": methodA 작업 실행");
        //여기까지는 작업내용이다.
        //notify를하면 다시 실행시킨다는 의미로 이 메서드는 실행대기상태가된다.
        notify();
        try {
            //wait은 일반예외를 발생시키므로 무조건 try-catch문을 작성하여야한다.
            wait();  //wait()을하면 다른스레드에게 실행권한이 돌아간다.
        }catch (InterruptedException e){}
    }
    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+": methodB 작업 실행");
        //이처럼 위 메서드a와 b를 같이 실행시켰을때
        //notify()를하게되면 실행대기상태가되고
        notify();
        try {    //wait()을실행해 다시 a메서드가 실행할수있도록한다.
            wait();
        }catch (InterruptedException e){}
    }

}
