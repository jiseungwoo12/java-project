package thisisjava.ch12.DateandCalenderClass;

import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

public class Calender3 {
    public static void main(String[] args) {
        //그럼 calander2에서 해보았던 미국의로스엔젤레스 시간값을 얻어왔는데
        //timezone에 넣을수있는 값을 어떻게 알아올수있을까??

        //타임존클래스의 정적메서드사용
        //TimeZone.getAvgetAvailableIDs()
        //이메서드는 string배열이리턴값이다
        String strarr[] = TimeZone.getAvailableIDs();
        for (String str : strarr){  //이렇게 배열값을 출력하면 무수히 많은 국가와 지역의 id가 나온다.
            System.out.println(str);
        }
        
        TimeZone timeZone = TimeZone.getTimeZone("VST");
        Calendar calendar = Calendar.getInstance(timeZone); //받는방식
    }
}
