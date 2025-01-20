package thisisjava.ch12.DateandCalenderClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        //날짜와 시간 조작
        //LocalDateTime 클래스
        //LocalDateTime클래스는 생성자가없고 정적메서드로 객체의 정보를 가져온다
        //now()정적메서드를 이용해 현재시간과날짜 값을 얻어온다.
        LocalDateTime now = LocalDateTime.now();
        //static LocalDateTime의 of메서드
        LocalDateTime of = LocalDateTime.of(2024,5,13,12,01,01);
        //이렇게 of메서드는 사용자 설정으로 지정된 날짜와 시간값을 가져올수있다
        //DateTimeFormatter는 날짜와 시간을 주어진 문자열 패턴으로 포맷하는것을 말한다.
        //public final class DateTimeFormatter
        //이클래스는 final클래스로 자손을 늘릴수없으며
        //생성자가없으므로 정적메서드를 통해서 객체를 얻어와야한다
        //ofPattern메서드  패턴을정하고 그 패턴대로 시간값을 가져온다.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH.mm.ss"); //여기서 a는 오전오후의 패턴
        System.out.println(now.format(dtf));  //now를 dtf형식으로 포맷해서 사용한다는 의미 now.format(dtf)

        //그러면 본론으로 돌아와서 now객체의 날짜시간값을 변경해보자
        //1년 더하기 plusYears(1)
        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 더하기 :"+result1);
        //minusMonths 월 빼기 2개월을뺀다
        LocalDateTime result2 = now.minusMonths(2);
    }


}
