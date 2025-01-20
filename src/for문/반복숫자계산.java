package for문;

import java.util.Scanner;

public class 반복숫자계산 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0){
            System.out.println("입력하세요.");
            System.out.println(T + "번");
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
            T--;
        }

    }
}
