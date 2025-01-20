package for문;

import java.util.Scanner;

public class 코스트코물건영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int totalAmount = sc.nextInt();
       int itemcount = sc.nextInt();
        int calculatedAmount = 0;
        for (int i = 1; i <= itemcount; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            calculatedAmount += price*quantity;
        }
        if (totalAmount == calculatedAmount){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        sc.close();
    }
}
