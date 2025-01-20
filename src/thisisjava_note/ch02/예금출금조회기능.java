package thisisjava_note.ch02;

import java.util.Scanner;

public class 예금출금조회기능 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int money = 0;
        while (true){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");

            System.out.print("선택> ");
            int button = scanner.nextInt();
            if (button == 1){
                System.out.println("현재 잔고 : "+money);
                System.out.print("예금액> ");
                money += scanner.nextInt();
                System.out.println("현재 잔고 :" +money);

            }else if (button == 2){
                System.out.print("출금액> ");
                int withdraw = scanner.nextInt();
                if (withdraw >money){
                    System.out.println("잔액이 부족합니다. 현재 잔액: "+money);
                }else {
                    money-=withdraw;
                    System.out.println("출금완료. 현재 잔액: "+money);
                }

            } else if (button == 3) {
                System.out.print("잔고> "+money);
                System.out.println();
            } else if (button == 4) {
                System.out.println("프로그램 종료");
                break;
            }


        }

    }
}
