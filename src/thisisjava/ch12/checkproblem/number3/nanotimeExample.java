package thisisjava.ch12.checkproblem.number3;

public class nanotimeExample {

    public static void main(String[] args) {
        //걸린시간을 나노초로 구하기
        long nanotime1 = System.nanoTime();
        int [] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] =i;
        }
        int sum = 0;
        for (int score : scores){
            sum+= score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);
        long nanotime2 = System.nanoTime();
        System.out.println("걸린시간" +(nanotime2 - nanotime1) + "초");
    }
}
