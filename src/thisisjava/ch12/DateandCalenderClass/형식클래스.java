package thisisjava.ch12.DateandCalenderClass;

import java.text.DecimalFormat;

public class 형식클래스 {
    public static void main(String[] args) {

        //숫자를 형식화된 문자열로변경
        //java.text.Format클래스
        //단위구분     DecimalFormat클래스를 이용해서 단위구분패턴을 생성자에 입력해준다
        DecimalFormat dcf = new DecimalFormat("#,###.0");  //예 1,000,000,0 이런식으로
        String result1 = dcf.format(111111111);
        System.out.println(result1);  //단위를 구분할때사용한다.


    }
}
