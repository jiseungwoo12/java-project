package thisisjava.ch12.DateandCalenderClass;

import java.util.Calendar;
import java.util.TimeZone;

public class Calander2 {
    public static void main(String[] args) {
        //다른 나라의 시간대 얻기
        //TimeZone객체를 얻는다
        //TimeZone에 getTimeZone()으로 미국의로스엔젤레스 시간대를 얻어보겠다
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        //캘린더 객체를 생성해 getInstance 매개값에 timezone객체를 넣는다 다형성
        Calendar calendar = Calendar.getInstance(timeZone);

        int ampm = calendar.get(Calendar.AM_PM);
        String strampm = null;
        if (ampm == Calendar.AM){
            strampm = "오전";
        }else {
            strampm = "오후";
        }
        System.out.println(strampm); //지금 미국로스엔젤레스의 시간대 오전오후
    }
}
