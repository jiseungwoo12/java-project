package thisisjava.ch12.StringclassExample;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str = "hellowoasodasodsod";
        String str2 = "world_java";
        String replacestr = replaceBuild(str,str2,5);
        //new StringBuilder클래스으 객체를 만들때
        //()매개변수값에 아무것도입력하지않으면 IndexOutOfBoundsException예외를 발생시킨다
        //왜냐 delete나 insert replace같은 수정기능을 사용할때
        //지정된 인덱스가없을시 인덱스를 찾을수없다는IndexOutOfBoundsException예외를 발생시키기때문이다.

        replacestr = new StringBuilder(replacestr).delete(15,18).toString();
        System.out.println(replacestr);
        //맨앞에다 내이름을 추가해보자                           //insert(위치 , 기본값|문자열)
        replacestr = new StringBuilder(replacestr).insert(0,"지승우의 ").toString();
        System.out.println(replacestr);
        //정리
        //append 문자열이나 기본값을 추가한다 맨 끝에다.
        //delete 삭제할 문자열인덱스값과 끝값을주어 삭제할 범위를 조정하여 삭제
        //insert 어디다 문자열이나기본값을 추가할지 인덱스위치를 주어 추가
        //replace 시작위치 끝위치 바꿀문자열 어디부터어디까지의범위에 문자열을 대체할지 정하고
        //변경한다
        //toString() //stringBuilder클래스를 문자열로 바꾸어준다.


    }
    //StringBuilder 클래스로 문자열을 replace로 변환하는 메서드를 만들어보자.
//문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의
// 인덱스 s부터 overwrite_string의 길이만큼을
// 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
    public static String replaceBuild(String my_string,String overwrite_string, int s){

        String sb = new StringBuilder(my_string).
                replace(s,s+overwrite_string.length(),overwrite_string).toString();
        //문자열 s부터 overwrite_string길이만큼을 바꾼다. 그러면
        //시작점 s 끝점 s+overwrite_string.length
                  //s부터 시작 s+overwrite_string.length()까지 바꿈, overwrite_string으로

        return sb;  //문자열로바꿔주는 toString(); string으로 리턴하는메소드이기때문
    }

}
