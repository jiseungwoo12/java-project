package backjunPractice;

import java.util.Scanner;

public class 나머지 {
    public static void remain(int a, int b, int c) {
        if ((a + b) % c == ((a % c) + (b % c)) % c) {
            System.out.println(1);
        } else
            System.out.println(0);
        if ((a * b) % c == ((a % c) * (b % c)) % c) {
            System.out.println(1);
        } else
            System.out.println(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result1 = (A+B)%C;
        int result2 =  ((A%C) + (B%C))%C;
        int result3 = (A*B)%C;
        int result4 = ((A%C) * (B%C))%C;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}