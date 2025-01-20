package thisisjava.ch12.checkproblem.number5;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i);

            if (i < 100){
                sb.append(",");
            }
        }
        String str = sb.toString();
        String strarr[] = str.split(",");
        for (String s : strarr){
            System.out.print(s+" ");
        }





    }
}
