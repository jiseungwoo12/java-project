package 백준1;

import java.util.Scanner;

public class 피라미드별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //밑의 삼각형
        for (int i = height-1; i >= 1; i--) {
            for (int j = 1; j <= height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
