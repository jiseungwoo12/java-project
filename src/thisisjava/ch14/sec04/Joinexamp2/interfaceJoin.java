package thisisjava.ch14.sec04.Joinexamp2;

public class interfaceJoin implements Runnable{
    private long sum;

    public long getsum(){
        return sum;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
    }
}
