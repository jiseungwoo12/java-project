package thisisjava.ch14.sec05.exam02;

public class ThreadA extends Thread{
    //A를 run() start()할 클래스를 새로만든다,
    //WorkObject에 만들어둔 methodA메서드를 사용하기위해
    //외부에서 변경할수없게 private로 설정후
    //Workobject 참조변수를 생성한다.
    private WorkObject workObject;

    
    //위 필드에서 선언한 참조변수값을 매개변수에넣고
    public ThreadA(WorkObject workObject){
        //매개변수값으로 받은 객체를 스레드네임설정을하여
        setName("ThreadA");
        this.workObject =workObject;
        //클래스객체를 만들때 이 이름을 사용하게 한다.
    }
    public void run(){
        //이렇게 A메서드를 반복문으로 출력하면
        //잘 출력된다.,
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}
