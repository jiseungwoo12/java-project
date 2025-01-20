package AlgorithmExample.num1;

import java.util.Scanner;

public class 전치행렬구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numArr[][] = new int[5][5];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = scanner.nextInt();
            }
        }

        //전치행렬구하기
        //먼저 전치행렬로 만들 배열을 하나생성한다
        //2중for문으로 값을 할당한다.
        int transpose[][] = new int[5][5];
        for (int i = 0; i < numArr.length; i++) { //다음인덱스로 넘어간뒤
            for (int j = 0; j < numArr[i].length; j++) {
                transpose[i][j] = numArr[j][i];
                //이코드는 transpose의 0,0 인덱스에 numArr의 0 0 1 0 2 0 3 0 4 0을저장하고
                //다음 인덱스 세로2에는 0.1 1.1 2.1 3.1 4.1
                //numArr[j][i]는 j의값만 ++되므로 transpose의 0인덱스에는 1 6 11 16 21
                //1인덱스에는 2 7 12 17 22
                //2인덱스에는 3 8 13 18 23 이렇게들어가게되는것이다.
            }
        }


        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.printf("%d\n", transpose[i][j]);
            }
            System.out.println();
        }
        }






    }

