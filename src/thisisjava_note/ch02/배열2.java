package thisisjava_note.ch02;

import java.util.Arrays;

public class 배열2 {
    public static void main(String[] args) {


        int[][]arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][]arr1 = {
                {1,2,3,4}, //3은 열(세로) 4는 행(가로)
                {5,6,7,8},
                {9,10,11,12}
        };

        boolean b = Arrays.deepEquals(arr1,arr2);
        System.out.println(b);



    }
}
