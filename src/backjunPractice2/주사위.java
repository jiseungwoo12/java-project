package backjunPractice2;

public class 주사위 {


    public static void main(String[] args) {

        int dice[] = new int[3];
        int price = 0;

        for (int i = 0; i < dice.length; i++) {
             dice[i] = (int)(Math.random()*6)+1;
        }
        if (dice[0] == dice[1] && dice[1] == dice[2]){
            price = 10000+dice[0]*1000;
            System.out.println(dice[0]);
        } else if (dice[0] == dice[1] || dice[1] == dice[2]) {
            int twodice = dice[0] == dice[1]? dice[0] : dice[1] == dice[2] ? dice[2] : 0;
            price = 1000+twodice*100;
            System.out.println(twodice);
        }else {
            int maxprice = 0;
            for (int i = 0; i < 3; i++) {
                if (maxprice < dice[i]){
                    maxprice = dice[i];
                }
            }
            price = maxprice*100;
            System.out.println(maxprice);
        }
        System.out.println(price);
    }
}
