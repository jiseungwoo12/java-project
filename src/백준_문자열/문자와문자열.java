package 백준_문자열;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char [] c = str.toCharArray();
        int index = sc.nextInt();
        System.out.println(c[index-1]);



    }
}
