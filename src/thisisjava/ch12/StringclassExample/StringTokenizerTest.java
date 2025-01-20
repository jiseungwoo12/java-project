package thisisjava.ch12.StringclassExample;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerTest {

    public static void main(String[] args) {

        //구분자로 분리하여 배열에 담을때 정규식으로분리하는 split과 StringTokenizer가 있다.

        //StringTokenizer는 한개의 구분자만 사용할수있다.

        String str = "java 좋아하는 승우";
        StringTokenizer st = new StringTokenizer(str, " ");

        String strarr [] = new String[st.countTokens()];
        int i =  0;
        while (st.hasMoreTokens()){  //남은토큰이있는지확인
            strarr[i++] = st.nextToken();  //구분자다음 토큰을불러옴
                                            //strarr는 빈배열이므로 +=를 안한다.
                                            //값을 대입하기만 하면됨.
        }
        for (String s : strarr){  //for each문을 사용하여 출력
            System.out.println(s);
        }
        System.out.println(Arrays.toString(strarr)); //배열의 모든요소를 출력

        String str2 = "자바   입니다  지승우가    사용중입니다,";

        String strarr2[] = regexMethod(str2);
        for (String s : strarr2){
            System.out.println(s);
        }

    }
    //그렇다면 split은 언제쓸까??
    //정규식표현을 사용해야할때
    //하나이상의공백이있을때 구분자로 분리해서 문자열배열에 담는 솔루션메서드를 만드시오
    public static String[] regexMethod(String string){

        String str[] = string.split("\\s+"); //하나이상의 공백을 구분하는구분자.
                        //"\\s+" 잘알아두자 " "하나면 이렇게 구분하면된다.
        return str;
    }

}
