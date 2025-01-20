package 백준_배열;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println(N + "개의 정수입력");
        for (int i = 0; i < N; i++) {

            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i+1];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max +" "+ min);

    }
}
