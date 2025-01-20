package for문;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
        //첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 9) {
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.println(i+"*"+j+"="+ i * j );
                }
            }
        }else {
            System.out.println("구구단 숫자가 아닙니다.");
        }

    }
}
