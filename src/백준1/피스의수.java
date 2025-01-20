package 백준1;

import java.util.Scanner;

public class 피스의수 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int [] standard = {1,1,2,2,2,8};
        int [] current = new int[6];

        for (int i = 0; i < current.length; i++) {
            current[i] = sc.nextInt();
        }
        for (int i = 0; i < standard.length; i++) {
            System.out.print(standard[i]-current[i]+ " ");
        }



    }
}
