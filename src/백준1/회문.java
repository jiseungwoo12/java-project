package 백준1;

import java.util.Scanner;

public class 회문 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char c[] = str.toCharArray();
        int result = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != c[c.length-i-1]){
                result = 0;
                break;
            }
            result = 1;
        }


        System.out.println(result);
    }
}
