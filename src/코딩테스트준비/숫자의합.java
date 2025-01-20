package 코딩테스트준비;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {

        //N개의 숫자가 공백없이 써있다 이 숫자를 모두합해 출력

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = c[i] -'0';
            sum+=num;
        }

        System.out.println(sum);


    }
}
