package backjunPractice;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result1 = num1*(num2 % 10);
        int result2 = num1*(num2 / 10 % 10);
        int result3 = num1*(num2 /100);
        int result4 = num1*num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
