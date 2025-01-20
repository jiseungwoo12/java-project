package thisisjava.ch12.DateandCalenderClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        //데이트 클래스는 여러개의 생성자가 선언되어있지만
        //지금 버전기준으로는 대부분 Deprecated되어있으므로 Date()생성자만 주로사용한다.
        //날짜의 값을 저장하기위한용도
        Date now = new Date();
        String toNow = now.toString();
        System.out.println(toNow);  //현재 날짜와 시간을 알려준다.

        //SimpleDateFormat클래스를 api도큐먼트에서 검색해보면
        //객체를 생성할때 생성자에 들어갈 패턴 방식이 나와있다
        //yyyy소문자는 년도 대문자MM은 달 소문자 dd는 일 HH는 시간 mm은 분 ss초로 패턴이 정의되어있다
        //만약에 이거말고 다른게 넣고싶다면은 api도큐먼트에서 패턴을 검색해보길바란다

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        String sdfnow = sdf.format(now);  //format메서드를통해 위에 패턴대로 날짜를 써줌.
        System.out.println(sdfnow);
    //대충이런식으로 나와있음.
//Letter	Date or Time Component	Presentation	Examples
//G	Era designator	Text	AD
//y	Year	Year	1996; 96
//Y	Week year	Year	2009; 09
//M	Month in year (context sensitive)	Month	July; Jul; 07
//L	Month in year (standalone form)	Month	July; Jul; 07
//w	Week in year	Number	27
//W	Week in month	Number	2
//D	Day in year	Number	189
//d	Day in month	Number	10
//F	Day of week in month	Number	2
//E	Day name in week	Text	Tuesday; Tue
//u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
//a	Am/pm marker	Text	PM
//H	Hour in day (0-23)	Number	0
//k	Hour in day (1-24)	Number	24
//K	Hour in am/pm (0-11)	Number	0
//h	Hour in am/pm (1-12)	Number	12
//m	Minute in hour	Number	30
//s	Second in minute	Number	55
//S	Millisecond	Number	978
//z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
//Z	Time zone	RFC 822 time zone	-0800
//X	Time zone	ISO 8601 time zone	-08; -0800; -08:00



    }
}
