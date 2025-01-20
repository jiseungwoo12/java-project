package thisisjava.ch12.checkproblem.number8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SimpleDateFormatExample {
    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.now();
                //EEEE는 요일의 전체이름을 나타냅니다.
                //Locale.ENGLISH 영어로 출력되게만듬.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 EEEE HH시 mm분", Locale.ENGLISH);
        String str = dtf.format(ld);
        System.out.println(str);



    }
}
