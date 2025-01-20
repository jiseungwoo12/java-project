package 백준_배열;

import java.util.Scanner;

public class 세준이의성적 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double newScore = (double)arr[i] /max*100;
            sum+=newScore;
        }


        double average = sum/N;
        System.out.println(average);
    }
}
