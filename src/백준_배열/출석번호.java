package 백준_배열;

import java.util.Scanner;

public class 출석번호 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int totalSum = 465;  // 1부터 30까지의 합 (30 * 31 / 2)
                int submitSum = 0;

                // 28명 제출한 학생들의 출석번호 입력받기
                for (int i = 0; i < 28; i++) {
                    submitSum += sc.nextInt();
                }

                // 제출하지 않은 두 명의 출석번호의 합 구하기
                int missingSum = totalSum - submitSum;

                // 학생들의 출석번호는 1부터 30까지이고, 이미 제출된 28명 제외하고 빠진 2명 출력
                boolean[] checked = new boolean[31];  // 출석번호 1번부터 30번까지 체크
                for (int i = 0; i < 28; i++) {
                    checked[sc.nextInt()] = true;
                }

                // 빠진 두 명의 출석번호 출력
                for (int i = 1; i <= 30; i++) {
                    if (!checked[i]) {
                        System.out.print(i + " ");
                    }
                }
            }
        }




