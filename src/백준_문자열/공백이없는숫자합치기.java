package 백준_문자열;

import java.util.Scanner;

public class 공백이없는숫자합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //숫자의 개수를  입력받기
        int N = sc.nextInt();
        //한 단어만 읽을때 next()사용
        String str = sc.next();
            int sum = 0;
        for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i)-'0';
        }
        System.out.println(sum);


    }
}
