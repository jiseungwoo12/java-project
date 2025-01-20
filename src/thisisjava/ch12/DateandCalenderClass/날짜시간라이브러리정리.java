package thisisjava.ch12.DateandCalenderClass;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;

public class 날짜시간라이브러리정리 {

    public static void main(String[] args) {

        //Date클래스 날짜 정보를 전달하기위해 사용
        Date now = new Date(); //현재시간을 반환
        String strnow = now.toString();
        //Date의 toString()메서드는  Fri Oct 18 13:51:09 KST 2024 이와같이 리턴되도록 오버라이딩됨
        System.out.println(strnow);
        //SimpleDateFormat 날짜와시간정보를 형식화된문자열로 포멧
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        //이렇게 문자열값으로 리턴값을 받고 sdf.format(포멧할 날짜시간); 하면 형식화되어 문자열로바뀐다.
        String strnow2 = sdf.format(now);
        System.out.println(strnow2);
        //Calender클래스 : 다양한 시간대별로 날짜와 시간을 얻을때(다른나라,다른지역)
        //추상클래스이므로 getInstance()를 통한 객체생성
        Calendar calendar = Calendar.getInstance();
        //calender 메서드의 리턴값은 int이므로 요일이나 오전/오후 if문이나 Switch문을 통해서 변환해준다
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        String strweek = null;
        switch (week) {
            case Calendar.MONDAY -> strweek = "월";
            case Calendar.TUESDAY -> strweek = "화";
            case Calendar.WEDNESDAY -> strweek = "수";
            case Calendar.THURSDAY -> strweek = "목";
            case Calendar.FRIDAY -> strweek = "금";
            case Calendar.SATURDAY -> strweek = "토";
            case Calendar.SUNDAY -> strweek = "일";
        }
        System.out.println(strweek+"요일");
        int ampm = calendar.get(Calendar.AM_PM);
        if (ampm == Calendar.AM){

        }
        
        
        //캘린더 클래스의 장점은 다른나라의 지역의 시간도 값을 얻어올수있다.
        


        //메서드사용

        String strweek2 = getDayWeekString(Calendar.getInstance());
        System.out.println(strweek2);

        String strampm2 = getAmPm(Calendar.getInstance());
        System.out.println(strampm2);

        //미국의 시간과 날짜를 알아보자
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar america = Calendar.getInstance(timeZone);

        String americaampm = getAmPm(america);
        System.out.println(americaampm);
        String americaWeek = getDayWeekString(america);
        System.out.println(americaWeek);

        //캘린더클래스보다 localDateTime이 더많이쓰이고 문자열변환에는 DateTimeformatter가 권장됨
        //날짜와 시간조작
        LocalDateTime ldt = LocalDateTime.now();
        //날짜와 시간 지정된문자열로 변환
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH.mm.ss");
        String strdtf = dtf.format(ldt);
        System.out.println(strdtf);
        String stramerica = dtf.format(ldt);

    }
    //calender클래스의 요일을 string으로 반환하는메서드
    public static String getDayWeekString(Calendar calendar){
        int DayWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String strweek = null;
        switch (DayWeek){
            case Calendar.MONDAY -> strweek = "월";
            case Calendar.TUESDAY -> strweek = "화";
            case Calendar.WEDNESDAY -> strweek = "수";
            case Calendar.THURSDAY -> strweek = "목";
            case Calendar.FRIDAY -> strweek = "금";
            case Calendar.SATURDAY -> strweek = "토";
            case Calendar.SUNDAY -> strweek = "일";
        }
        return strweek;


    }

    public static String getAmPm(Calendar calendar){
        int ampm = calendar.get(Calendar.AM_PM);
        String strampm = null;
        if (ampm == Calendar.AM){
            return strampm = "오전";
        }else
            return strampm = "오후";
    }


}
