package thisisjava.ch12.DateandCalenderClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class localDate과DateTimeFormatter {

    //자바 8버전 이후부터는 이 캘린더와 데이트 심플데이터포멧 보단 이 두개의 클래스를 사용하는걸권장
    public static void main(String[] args) {


        //now() 현재의 시간대를 가져옴
        LocalDateTime ldt = LocalDateTime.now();
        //localdateTime의 시간수정

        //지금시간대를 가져온 now객체에서 플러스해줄것을 플러스 마이너스는 마이너스를 붙여 하면됨.
        LocalDateTime result1 = ldt.minusDays(1);

        //시간과날짜를 사용자설정으로 포맷해서 사용
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH.mm.ss");
        //이렇게 포맷해서 사용할 날짜와시간을 포맷해서 사용
        System.out.println(dft.format(result1));

        //날짜와 시간비교
        //boolean isAfter(other) //이후날짜인지
        //boolean isBefore(other) //이전 날짜인지
        //boolean isEqual(other) //동일한 날짜인지

        //long until(other, unit) //주어진 단위 차이를 리턴

        //일단 localDateTime now()현재날짜와
        //메서드 체이닝을 이용한 날짜수정코드를 비교해보자
        LocalDateTime ldt2 = LocalDateTime.now();
        //메서드 체이닝을통해 메서드를 여러번 호출해 반복한다
        LocalDateTime changeldt = ldt2.minusDays(10).minusMonths(2).minusYears(2);
        long untilyear = ldt2.until(changeldt, ChronoUnit.YEARS);
                                    //비교할대상, 뭐를비교할건지
        System.out.println(untilyear);  //-2년
        long untildays = ldt2.until(changeldt,ChronoUnit.DAYS);
        System.out.println(untildays);  //-802일
        long untilmonth = ldt2.until(changeldt,ChronoUnit.MONTHS);
        System.out.println(untilmonth);  //-26달


    }
}
