package thisisjava.ch12.DateandCalenderClass;

import java.util.Calendar;

public class CalanderClassTest {
    public static void main(String[] args) {

        //이번에는 캘린더클래스를 알아보자
        //캘린더클래스는 달력을 표현하는 추상클래스이므로
        //캘린더클래스의 getInstance()메서드를 통해 값을 얻어야한다
        //getInstance()는  스태틱메서드이다.
        //getInstance()를해서 객체를얻어오면 현재 시간기준으로 설정된다.
        Calendar cal = Calendar.getInstance();
        //get메소드를 통해 값을 얻어오자
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;  //0부터시작하므로 0~11 +1을통해 1~12로 바꿈
        int day = cal.get(Calendar.DATE);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        //DAY_OF_WEEK는 int형으로 일월화수목금토 순으로 수요일 4 이런식으로 반환한다
        //이걸 switch문으로 문자열로 반환하도록 하겠다.
        String strweek = null;
        switch (week){  //향상된 스위치문 break를 따로추가하지 않아도 된다.
            case Calendar.MONDAY -> strweek = "월";
            case Calendar.TUESDAY -> strweek = "화";
            case Calendar.WEDNESDAY -> strweek = "수";
            case Calendar.THURSDAY -> strweek = "목";
            case Calendar.FRIDAY -> strweek = "금";
            case Calendar.SATURDAY -> strweek = "토";
            case Calendar.SUNDAY -> strweek = "일";
        }


        //AM_PM도 정확한 오전오후를 나타내는 말이없으므로 구분지어준다.
        int ampm = cal.get(Calendar.AM_PM);
        String strAmPm = null;
        if (ampm == Calendar.AM){
            strAmPm = "오전";
        }else {
            strAmPm = "오후";
        }
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);


        System.out.print(strweek+"요일 ");
        System.out.println(strAmPm);



    }
}
