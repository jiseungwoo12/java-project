package thisisjava.ch14.sec04.Joinexamp;

public class JoinThread extends Thread{

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    private long sum;


    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
    }




}
