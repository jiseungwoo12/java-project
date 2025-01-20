package thisisjava.ch15.StackLIFOExam.Coin;

import java.util.Comparator;

public class Coin {
    //동전의 값 500 100 50 10
    final int VALUE;

    public Coin(int VALUE){
        this.VALUE =VALUE;
    }
    public int getvalue(){
        return this.VALUE;
    }

}
