package 백준_배열;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        System.out.println(N +"개의 정수를 입력하세요");
        for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
        }
        int V = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(V == arr[i]){
                sum++;
            }
        }
        System.out.println(sum);



    }
}
