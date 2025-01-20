package thisisjava.ch13.제네릭.num4;

public class GenericExample {
    public static void main(String[] args) {
        //제네릭으로 타입을 제한하지않고 그냥 객체를생성하였을땐
        //object 파라미터로 설정된다.
        //String문자열이 리터럴되어 box.content에 값이 저장되는것이다.
        //object = "100";
        Box box = new Box();
        box.content = "100";
        Box box2 = new Box();
        box2.content = "100";
        Box box3 = new Box();
        box3.content = 100;


        //그러므로 box객체의 equals()는
        //box.content = 문자열 이므로
        //문자열클래스에 재정의된 equals()메서드로 비교하게된다.
        boolean result = box.compare(box2);
        System.out.println(result);
        //문자열과 정수의 비교
        //문자열과 정수값은 애초당시 비교하면 다른객체를 비교하므로 false가나온다
        boolean result2 = box.compare(box3);
        System.out.println(result2);
    }
}
