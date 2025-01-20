package thisisjava.ch13.제네릭Test.test2;

import javax.print.DocFlavor;

//제네릭타입은 선언부에 <> 부호가붙고 그 안에 타입 파라미터들이 존재한다
//타입 파라미터는 변수명과 동일한 규칙에 따라 작성할수있지만 일반적으로 대문자 알파벳 한글자로 표현
//<T> 아니면 <A-Z>의 값중하나로 표현이 일반적



public class Product <A, B>{
    //클래스의 필드에도 타입파라미터값을 적용해보자
    public A kind; //아직 정해지지않는 타입 객체를 생성할때 타입이정해짐.
    public B model;

    //getter와 setter도 같이 타입 파라미터로 선언한다
    //setter
    //setter는 kind와 model값을 정하는것이기때문에
    //매개변수값에 파라미터를 적용한다.
    public void kindset(A kind){ this.kind = kind;}
    public void modelset(B model){this.model = model;}
    //getter는 kind와 model값을 리턴해야하므로 리턴값에 파라미터(아직정해지지않은값)를 적용한다.
    public A getKind(){return kind;}
    public B getModel(){return model;}

}
//외부(메인메서드)에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야한다.
class MaintesT{
    public static void main(String[] args) {
        //사용하고자 할 클래스의 파라미터 개수의따라 <A,B> <A=String,B=Integer>
        //써주어야한다. 다시말하지만 파라미터값에는 클래스와 인터페이스 타입만 들어와야한다.
        Product<String, Integer> product = new Product<>();
        //만약 지정하지않으면 object타입이 암묵적으로 사용된다.
        Product product2 = new Product(); //<Object>가 생략됬다고도 볼수있다.
    }
}
