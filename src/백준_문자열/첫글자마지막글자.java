package 백준_문자열;

import java.util.Scanner;

public class 첫글자마지막글자 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.nextLine();
        String strarr[] = new String[num];

        for (int i = 0; i < strarr.length; i++) {
            strarr[i] = sc.nextLine();
            char c[] = strarr[i].toCharArray();
            System.out.println(c[0] + " "+c[c.length-1]);
        }





    }
}
