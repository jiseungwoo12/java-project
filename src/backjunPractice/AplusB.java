package backjunPractice;

import java.util.Scanner;

public class AplusB {
    //A+B를 입력받아 출력
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int inputa = sc.nextInt();
        int inputb = sc.nextInt();
        System.out.println(inputb+inputa);

        //A-B를 입력받아출력
        int inputa2 = sc.nextInt();
        int inputb2 = sc.nextInt();
        System.out.println(inputa2-inputb2);
    }
}
