package MathQuiz.quiz1;

import java.util.Scanner;

public class 소수판별기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("소수를 입력하세요:");
        int input = sc.nextInt();
        if ((input / 1 == input) && (input % input == 0)){
            System.out.println(input +"은 소수입니다.");
        }else
            System.out.println(input+"은 소수가 아닙니다");


    }
}
