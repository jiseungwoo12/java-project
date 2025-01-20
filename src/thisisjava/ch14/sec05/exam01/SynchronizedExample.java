package thisisjava.ch14.sec05.exam01;

public class SynchronizedExample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);


        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
        user1Thread.start();
    }
}
