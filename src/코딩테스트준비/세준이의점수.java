package 코딩테스트준비;

import java.util.Scanner;

public class 세준이의점수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int scores[] = new int[N];
        //최댓값
        int maxscore = 0;
        
        //새로운 점수계산을위한 배열
        int newscore[] = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (maxscore < scores[i]){
                maxscore = scores[i];
            }
            newscore[i] = scores[i]/maxscore*100;
        }

        for (int i = 0; i < N; i++) {

        }




    }
}
