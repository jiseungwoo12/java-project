package thisisjava.ch16.Exam05;

public class LambdaExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.action((x,y)->{
            return  x+y;
        });
        person.action((x,y)->x-y);

        person.action((x,y)->{
            return Computer.staticMethod(x,y);
        });

        person.action((x,y)->Computer.staticMethod(x,y));
        person.action(Computer::staticMethod);

    }
}
