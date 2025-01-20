package thisisjava.ch12.checkproblem.number9;

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        //첫번째는 알파벳으로 시작하고 두번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID값인지
        //검사하고싶다. 알파벳은 대소문자를 모두허용
        String id = "aAngel1004";
        //^[a-zA-Z] 첫글자로 숫자는 올수없고 [a-zA-Z0-9]{7,11}$ 알파벳과 숫자로구성된 8~12자리값으로 끝남 $표시
        //$표시는 이것을 끝으로 다른게 올수없고 마무리 지으라는 의미.
        String regExp = "^[a-zA-Z][a-zA-Z0-9]{7,11}$";
        //Pattern.compile() 패턴객체를만들고 그안에 정규식을 컴파일한다.
        Pattern pattern = Pattern.compile(regExp);
        //컴파일한값이랑 내가입력한값을 매치시켜서 맞으면 true 아니면 false값을 리턴한다.
        boolean result = pattern.matcher(id).matches();
        System.out.println(result);
    }
}
