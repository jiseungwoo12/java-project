package thisisjava_note.ch02;

import java.util.Arrays;

public class 배열정라ㅣ {
    public static void main(String[] args) {

        int [] score = new int[5];
        //값을 각각 넣어주는방법
        score[0] = 10;
        score[1] = 20;
        score[2] = 30;
        score[3] = 40;
        score[4] = 50;

        System.out.println(Arrays.toString(score));

        for (int i : score){
            System.out.println(i);
        }

//        int i = 1;
//        for (int n : number){
//            number[n] = 10*i;
//            i++;
//            System.out.println(number[n]);
//        }
        




    }
}
