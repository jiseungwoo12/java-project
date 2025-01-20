package thisisjava.ch13.제네릭Test.quiz.num1;

public class Example {
    public static void main(String[] args) {
        Container<String>container = new Container<>();
        container.set("지승우");
        String name = container.get();
        System.out.println(name);

        Container<Integer> container1 = new Container<>();
        container1.set(10);
        int int1 = container1.get();
        System.out.println(int1);
    }
}
