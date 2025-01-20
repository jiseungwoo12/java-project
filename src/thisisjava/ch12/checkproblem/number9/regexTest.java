package thisisjava.ch12.checkproblem.number9;

import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args) {

        String regex1 = "[aeiou]";
        //Pattern.CASE_INSENSITIVE 대소문자 구분없이 비교
        Pattern pattern = Pattern.compile(regex1,Pattern.CASE_INSENSITIVE);

    }
}
