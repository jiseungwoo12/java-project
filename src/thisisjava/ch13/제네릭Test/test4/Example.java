package thisisjava.ch13.제네릭Test.test4;

public class Example {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(150);
        Box<Integer> box2 = new Box<>(150);

       boolean b = box.compare(box2);
        System.out.println(b);

    }
}
