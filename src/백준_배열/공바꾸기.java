package 백준_배열;

import java.util.Scanner;

public class 공바꾸기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int basket[] = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        int M =sc.nextInt();
        for (int i = 0; i < M; i++) {
            int change1 = sc.nextInt() -1; //배열의인덱스값에 들어가야하므로 -1로 0base로 초기화
            int change2 = sc.nextInt() -1;
            int temp = 0;
            temp = basket[change1];
            basket[change1] = basket[change2];
            basket[change2] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i]+" ");
        }
        
    }
}
