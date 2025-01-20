package AlgorithmExample.num1;

import java.util.Random;
import java.util.Scanner;

public class 스무고개게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0~100까지의 랜덤 정수 생성
        int randomInt = random.nextInt(101);
        System.out.println("스무고개 게임에 오신 것을 환영합니다!");
        System.out.println("0에서 100 사이의 숫자를 맞춰보세요!");

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int userInt = scanner.nextInt();
            System.out.println("문제정답: "+randomInt);

            if (userInt == randomInt) {
                System.out.println("정답입니다! 게임을 종료합니다.");
                break;
            } else if (userInt > randomInt) {
                System.out.println("입력한 숫자가 큽니다. 다시 시도하세요.");
            } else {
                System.out.println("입력한 숫자가 작습니다. 다시 시도하세요.");
            }
        }
        scanner.close(); // Scanner 리소스 닫기
    }
}
