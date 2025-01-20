package thisisjava.ch13.제네릭.num1;

public class BoxExample {
    public static void main(String[] args) {

        //<T>(빈 타입)를 string타입으로 대체하겠다.
        Box<String> box = new Box<>();
        //문자열로 타입이 설정되었기때문에
        //다른 타입은 올수없다.
        box.content = "지승우물건";
        String value = box.content;
        System.out.println(value);
        
        //이번에는 <Integer> 타입만들어올수있는 제네릭타입으로  객체를 생성해보자
        Box<Integer> boxint = new Box<>();

        //이게가능한이유 박싱기술때문에. int가 Integer로 자동형변환된다
        boxint.content = 100;  //박싱
        //boxint객체는 integer타입이기때문에 그 안에있는값도 모두 integer형태로받아야한다
        int boxvalue = boxint.content;  //언박싱  
        //언박싱
        System.out.println(boxvalue);  

    }
}
