package thisisjava.ch12.checkproblem.number4;

import java.util.Arrays;
public class DecodingExample {
    public static void main(String[] args) {
        //다음 바이트배열은 utf-8 믄자셋으로 인코딩한 데이터로
        //다시 문자열로 디코딩해서 변수 data에 저장하려고합니다.
        byte[] bytes = {-20,-107,-120,-21,-123,-107};
        String data = new String(bytes);
        System.out.println(data);




        }
    }

