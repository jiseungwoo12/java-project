package thisisjava.ch15.StackLIFOExam.Coin;

import java.util.Stack;

public class CoinStackExam {
    public static void main(String[] args) {
        //스택 객체는 LIFO 라스트인풋퍼스트아웃 마지막에들어간것이 먼저꺼내진다
            
        Stack<Coin> coinbox = new Stack<>();
        coinbox.push(new Coin(500));
        coinbox.push(new Coin(100));
        coinbox.push(new Coin(50));
        coinbox.push(new Coin(10));


        while (!coinbox.isEmpty()){
            Coin coin = coinbox.pop();
            System.out.println("꺼낸 동전 :" + coin.getvalue());
        }
        
        
        
    }
}
