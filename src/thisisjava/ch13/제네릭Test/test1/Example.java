package thisisjava.ch13.제네릭Test.test1;

public class Example {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.content = "지승우";
        String boxstr = box.content; //강제 타입변환없이 얻을수있다.
        System.out.println(boxstr);


//        Box<int> box1 = new Box<int>(); //기본형은 <T>파라미터값에 들어갈수없다.
        Box<Integer> box1 = new Box<>(); //클래스나 인터페이스의 타입만 파라미터(제네릭 매개변수)에 들어간다.
        box1.content = 100; //오토박싱으로 인해 int 100이 integer값에 변환되어 들어간다.
        int intbox = box1.content; //언박싱으로 인해 Integer형태인 box1.content가 int로 변환되어 대입된다.
        System.out.println(intbox);
    }
}
