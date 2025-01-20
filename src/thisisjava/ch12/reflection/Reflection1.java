package thisisjava.ch12.reflection;

public class Reflection1 {

    public static void main(String[] args) throws Exception{

        //리플렉션이란 클래스와 인터페이스의 메타정보를 읽고 수정해주는 행위를 리플렉션이라한다
        //옆에 Structure View -> Tools windows -> Structure(구조)를열면 클래스의 구조
        //인터페이스의 구조 정보를 얻을수있는것을 확인할수있다
        //이러한 메타정보를 읽고 수정해주는것이 리플렉션이라고한다.
        //리플렉션을하려면 Class객체를 얻어 관리해야한다
        //프로그램에서 Class객체를 얻는방법
        //class가 아닌 C가 대문자인 클래스이다
        //클래스영역에 클래스가 생성되면 클래스영역에는 바이트코드로 저장된다는것을
        //이미배웠으므로 이 클래스 참조변수에다가 그 저장된 내용을 끌어쓴다는것이다.
//        Class clazz = 클래스이름.class; 클래스이름만가지고 Class객체얻기
//        Class clazz = Class.forname("패키지 '''' 클래스이름";  //위와동일
        //Class clazz = 객체참조변수.getClass(); //객체로부터 클래스객체를 얻기
                //위세방법중 어느 한가지를 써도 동일한결과를 얻는다.

        Class clazz = Car.class;
        //forname은 잘못입력할경우 예외가 발생하므로 예외처리해야한다
        Class clazz2 = Class.forName("java.lang.String");

        //객체를 이용해 참조하기
        String str = "지승우";
        Class clazz3 = str.getClass();


        
  }
}
