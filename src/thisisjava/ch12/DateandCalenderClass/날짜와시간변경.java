package thisisjava.ch12.DateandCalenderClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜와시간변경 {

    public static void main(String[] args) {
        //LocalDateTime 클래스와 DateTimeFormatter 클래스를 이용해서 날짜와 시간을
        //yyyy.MM.dd HH.mm.ss 형식으로 바꾼후
        //10년더하기 3개월빼기 15더하기 해보자

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH.mm.ss");

        String strnow = now.format(dtf);
        System.out.println(strnow);
        LocalDateTime result1 = now.plusYears(10);
        System.out.println(result1.format(dtf));
        result1 = now.minusMonths(3);
        result1 = now.plusDays(15);
        System.out.println(result1.format(dtf));

    }
}
