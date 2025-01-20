package thisisjava.ch13.Quiz.num2;



public class ContainExample {
    public static void main(String[] args) {
        Container<String,String> container = new Container<>();
        container.set("지승우","도적");
        System.out.println(container.getKey());
        System.out.println(container.getValue());


        Container<String, Integer> container1 = new Container<>();
        container1.set("지승우",35);
        String name = container1.getKey();
        int age = container1.getValue();
        System.out.println(name+" "+age);

    }
}
