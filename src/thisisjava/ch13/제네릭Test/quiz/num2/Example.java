package thisisjava.ch13.제네릭Test.quiz.num2;

public class Example {
    public static void main(String[] args) {
        Container<String,String> container = new Container<>();
        container.set("지승우","학생");
        String key = container.getKey();
        String value = container.getValue();
        System.out.println("key: "+key + "  value: " + value );

        Container<String,Integer> container2 = new Container<>();
        container2.set("지승우",24);

    }
}
