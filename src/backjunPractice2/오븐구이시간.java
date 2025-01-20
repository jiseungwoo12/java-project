package backjunPractice2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class 오븐구이시간 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int cooktime = sc.nextInt();
        LocalTime lt = LocalTime.of(hour, minute);
        LocalTime cooktimer = lt.plusMinutes(cooktime);

        System.out.println(cooktimer.getHour() + " " + cooktimer.getMinute());

    }
}
