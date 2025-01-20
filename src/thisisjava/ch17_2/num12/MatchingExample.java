package thisisjava.ch17_2.num12;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {

        int intarr[] = new int[]{2,4,6,8,10,12,14};

        boolean result = Arrays.stream(intarr)
                .allMatch(i->i%2==0);
        System.out.println("2의배수만 있는지?"+result);

        result = Arrays.stream(intarr)
                .anyMatch(i->i%3==0);
        System.out.println("하나라도 3의배수가 있는지?"+result);
            //3의배수가 있으므로 true
        result = Arrays.stream(intarr)
                .noneMatch(i->i%3==0);
        System.out.println("3의배수가 없는지?"+result);
        //3의배수가 있으므로 false반환
    }
}
