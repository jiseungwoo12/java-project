package thisisjava.ch12.RegularExpression;

import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {

        //정규식표현에 대해서알아보자
        //문자열이 정해진 형식으로 구성되어있는지 검증해야하는 경우가있다
        //예를들어 이메일이나, 전화번호를 사용자가 제대로 입력햇는지 검증할때다.

        //[]한개의문자
        //[abc] abc중 하나의문자.
        //[^abc] abc가아닌 하나의문자
        //[a-zA-Z] a~Z까지의 문자
        //\d 한개의 숫자 0~9
        //\s 공백
        //+ 하나이상
        //\s+ 하나이상의공백
        //\w 한개의 알파벳또는 한개의숫자[a-zA-Z]와동일
        //\w+ 여러개의 알파벳또는 여러개의숫자
        // \.   .점이다
        // . 모든문자중하나의 문자  []와같음
        // ? 없음 또는 한개
        // * 없음 또는 한개이상
        // {n} 정확히 n개
        // {n,} 최소한 n개
        //{n,m} 최소 n개부터 m개까지
        //a|b a또는 b
        //() 그룹핑

        //02-123-1234 또는 010-1234-5678
        //02아니면010 - 한개의숫자 3개아니면 4개 - 한개의숫자 정확히 4개
        //(02|010)-\d{3,4}-\d{4}

        //white@naver.com
        //\w+@\w+\.\w+(\.\w+)?

        //그렇다면 Pattern 클래스로 검증을해보자

        String regexp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-7137-6584";
        boolean result1 = Pattern.matches(regexp,data);
        if (result1){
            System.out.println("이메일 작성코드와 같습니다.");
            System.out.println(data);
        }else{
        System.out.println("다릅니다.");}
        
        String str = "010-7137-6584";
        String phone = storePhoneNumber(str);
        System.out.println(phone);


    }
    //그렇다면 전화번호를 입력하면 전화번호형식이 올바른지 확인하는 메서드를 만들자
    //010-0000-0000;
    private static boolean getPhoneNumber(String number){
        String regex = "^010-\\d{4}-\\d{4}";
        boolean result = Pattern.matches(regex,number);
        if (result){
            System.out.println("올바른 전화번호입니다.");
            return true;
        }else {
            System.out.println("올바르지 않은 전화번호형식입니다.");
            return false;
        }
    }
    //그럼 이 올바른 전화번호를 담아 전화번호를 문자열에 저장하는 코드를 작성해보자
    public static  String storePhoneNumber(String number){
        if (getPhoneNumber(number)){
            String storephoneNumber = number;
            System.out.println("저장된 전화번호는 :"+ storephoneNumber);
            return storephoneNumber;
        }else {
            System.out.println("전화번호를 저장할수없습니다. 형식이 잘못되었습니다.");
            return null;
        }
    }


}
