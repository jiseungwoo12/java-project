package thisisjava.ch12.checkproblem.number4;

import java.util.Arrays;

public class incodingtest {
    public static void main(String[] args) throws Exception{
        //이번에는 문자열을 byte코드로 인코딩해보자.

        String data = "지승우";
        byte[] bytes = data.getBytes(); //기본 인코딩이 utf-8이기때문에
        //아무런 입력없이 bytes에 변환된다.
//        for (byte b : bytes){
//            System.out.println(b);
//        }
        //utf-8은 한글 3바이트이므로 총9개의 바이트코드가 나온다
        System.out.println(Arrays.toString(bytes));

        String data2 = "지종우";
        //getbytes 메서드의 charsetName의 매개변수는 입력할시 잘못된값을 입력하면 예외를던진다.
        byte[] bytes1 = data2.getBytes("EUC-KR");
        System.out.println(Arrays.toString(bytes1));
        //EUC-KR은 한글 2바이트로 변환되는것을 알수있다

    }
}
