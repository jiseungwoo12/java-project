package thisisjava.ch13.제네릭Test.test5;

public class JenericMethod {
    //public class JenericMethod<T>
    //제네릭타입
    //제네릭 메서드는 타입 파라미터를 가지고있는 메소드를 말한다.
    //타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가있다.
    //제네릭 메서드는 리턴타입 앞에 <>기호를 추가하고 타입 파라미터를 정의한뒤
    //리턴 타입과 매개변수 타입에서 사용한다
//    public <A,B> String stringparameter()
    //리턴타입앞에다 붙인다.
    //다음 boxing()메서드는 타입 파라미터로 <T>를 정의하고 매개변수 타입과 리턴 타입에서 t를 사용한다.
        public static <T>Box<T> boxing(T t){
            Box<T> box = new Box<>();
            box.setbox(t);
            return box;
        }
    public static void main(String[] args) {
            Box<String> box1 = boxing("hello");
            String strbox = box1.getBox();
        System.out.println(strbox);

        Box<Integer> box = boxing(100);
        int boxint = box.getBox();
        System.out.println(boxint);

    }
}
