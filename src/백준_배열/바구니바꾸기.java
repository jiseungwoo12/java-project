package 백준_배열;

import java.util.Scanner;

public class 바구니바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int basket[] = new int[N];
        for (int i = 0; i < N; i++) {
                basket[i] = i+1;
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1;  //역순으로 만들 범위
            int end = sc.nextInt() - 1;

            while (start < end) {
                int temp;
                temp = basket[start];
                basket[start] = basket[end];
                basket[end] = temp;
                start++;
                end--;
            }
            }

        for (int i : basket){
            System.out.print(i+" ");
        }

        }


    }

