package project_math;

import java.util.Scanner;

public class math1 {
    public static void main(String[] args) {

//        int value = (2*((3+2)**2)/5-4); //에러 자바에서는 **제곱연산이없음
        int value = (int)(2*Math.pow((3+2),2)/5-4);
        //Math.pow(제곱할값,제곱수)
        System.out.println(value);

        Scanner sc = new Scanner(System.in);

        //변수 x
        //어
//        int x = sc.nextInt();
//        int product = x*5;
//        System.out.println(product);

        //간단한 선형함수
//        int x = sc.nextInt();
//        int y = (2*x)+1;
//        System.out.println(y);

        //선형함수 2
        //f(x) = x의함수
        //f(x) = 2x+1;

        int x_values[] = new int[] {1,2,3,4,5};
        for (int i = 0; i < x_values.length; i++) {
            int x = function(x_values[i]);
            System.out.println(x);
        }

    }
    public static int function(int x){
        return 2*x+1;
    }
}
