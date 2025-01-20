package thisisjava.ch14.sec05.exam02;

public class WaitNotifiyExam {
    public static void main(String[] args) {
        WorkObject workObject = new WorkObject();
        //메서드a와 b를 사용하기위해 workobject 객체를 생성한다
        ThreadA threadA = new ThreadA(workObject);
        //스레드로 각각 실행하기위해 생성자에 메서드객체를 넣는다.
        ThreadB threadB = new ThreadB(workObject);
        //run메서드에 workobject의 메서드가 실행이된다.
        threadA.start();
        //2개가같이실행되면
        threadB.start();
        //wait()과 notify의 반복으로 인해 반복적으로 a,b순으로 나열되게 출력될 것이다.



    }
}
