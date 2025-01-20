package thisisjava.ch12.StringclassExample;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Stringclass {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //getByte
        //인코딩
        String str  = "지승우";
        byte[] byte1 = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(byte1));
        //charsetName은 잘못입력될시 예외를 발생시키게 되어있다
        //따라서 실행할메서드에 throw 예외를 붙여줘야한다.
        //getBytes는 바이트배열로 리턴받게되어있다
        //UTF-8은 한글3바이트 영어 1바이트로 반환한다
        //EUC-KR 은 한글 2바이트 영어 1바이트로 반환한다

        String str2 = "지종우";
        byte byte2[] = str2.getBytes("EUC-KR");
        System.out.println(Arrays.toString(byte2)); //Arrays.toString은 배열의 값을 출력해준다

        //이렇게결과로 알수있듯이
        //3 3 3 9개의 바이트코드
        //2 2 2 6개의 바이트코드를 반환한다
        //charsetName매개변수에 하나로통일된 인코딩을하고싶다면 적어주면된다
        //인텔리제이의 기본 인코딩은 utf-8이다.

        //이번엔 디코딩을해보자.
        String decoding = new String(byte1);
        System.out.println(decoding);
        String decoding2 = new String(byte2);
        System.out.println(decoding2);
        //EUC-KR 로 인코딩된 바이트코드를 디코딩할때 오류가발생하는데
        //이건 디코딩기준이 UTF-8기준이라 오류나는것. 디코딩할때도 하나로통일하고싶다면
        //,찍고 charset기준을 변경하면된다.
        String decoding3 = new String(byte2, "EUC-KR");
        System.out.println(decoding3);
        //이렇게 charsetName을 같은기준으로 맞춰준다면 오류없이 잘 디코딩된다.

    }
}
