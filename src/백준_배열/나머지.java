package 백준_배열;

import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //10개의 정수를 입력받을수있는 배열
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt()%42;
        }

       //중복 체크를 위한 배열
        boolean[] isVisited = new boolean[42];
        int uniqueCount = 0;

        for (int i = 0; i < 10; i++) {
            if(!isVisited[arr[i]]){
                isVisited[i] = true;
                uniqueCount++;
            }
        }
        System.out.println(uniqueCount);





    }
}
