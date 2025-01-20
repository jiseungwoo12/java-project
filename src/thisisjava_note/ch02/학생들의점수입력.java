package thisisjava_note.ch02;

import java.util.Scanner;

public class 학생들의점수입력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Students[] = null;

        while(true){
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            int button = sc.nextInt();

            if (button == 1) {
                System.out.print("학생수> ");
                Students = new int[sc.nextInt()];
            } else if (button == 2) {
                if (Students.length != 0){
                    for (int i = 0; i < Students.length; i++) {
                        System.out.println(Students.length-i+"명의 학생의 점수를 입력해야 합니다.: ");
                        System.out.print("scores"+"["+i+"]"+">");
                        Students[i] = sc.nextInt();
                    }
                }else {
                    System.out.println("학생이 없습니다.");
                }
            }else if (button == 3){
                for (int i = 0; i < Students.length; i++) {
                    System.out.println("scores"+"["+i+"]"+": "+ Students[i]);
                }
            }else if (button == 4){
                int max = 0;
                int sum = 0;
                for (int i = 0; i < Students.length; i++) {
                    sum += Students[i];
                    if (max < Students[i]) {
                        max = Students[i];
                    }
                }
                System.out.println("최고 점수 : "+max);
                System.out.println("평균 점수 : "+sum/Students.length);
            } else if (button == 5) {
                break;
            }else {
                System.out.println("숫자가 아닌값이나 정보에없는 숫자를 입력하셨습니다. 다시 입력하세요.");
            }


        }
        System.out.println("프로그램 종료");
    }
}
