package thisisjava.ch13.제네릭.num4;

public class Box <T>{
    public T content;

            //기본적으로 <T> 타입 파라메터는 object타입을 의미한다.
                //그래서 타입이 정해지지않았어도 object클래스의 equals()메서드를 사용할수있는것이다.
                //이 메서드를호출할때 매개변수값에 String타입의 객체가왔을때는 재정의된 오버라이딩값으로 계산한다.
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }

}
