package backjunPractice2;

import java.time.LocalTime;
import java.util.Scanner;

public class 창영이에알람시간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int changyonghour = sc.nextInt();
        int changyongminute = sc.nextInt();

        int sanguntimeminute = 45;

        LocalTime lt = LocalTime.of(changyonghour,changyongminute);
        LocalTime sanguntime = lt.minusMinutes(sanguntimeminute);
        System.out.println(sanguntime.getHour() + " " +sanguntime.getMinute() );



    }
}
