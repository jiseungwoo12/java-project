package 백준_반복문;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        //두정수 a b를 입력받은다음 a+b를 출력하는프로그램

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int sum[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum[i] = a[i]+b[i];
            System.out.println(sum[i]);
        }


    }
}
