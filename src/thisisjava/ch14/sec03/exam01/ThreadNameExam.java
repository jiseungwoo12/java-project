package thisisjava.ch14.sec03.exam01;

public class ThreadNameExam {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread();
        System.out.println(mainthread.getName());

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(){
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            thread.start();

        }
        Thread chatThread = new Thread(){
            public void run(){
                System.out.println(getName()+ " 실행");
            }
        };
        chatThread.setName("chatThread");
        chatThread.start();
    }
}
