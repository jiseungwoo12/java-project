package thisisjava.ch16.returnLambdaExam;


public class RambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x,y)->{
            double result =x+y;
            return  result;
        });
        //return문이 한개일때에는 생략가능하다.
        person.action((x,y)->x-y);
        //return을사용할수있지만 {}중괄호로 덮어주어야한다
        person.action((x,y)->{return x-y;});
        person.action((x,y)->{
            return sum(x,y);
        });
        //return값이 하나라면 이렇게할수있다
        person.action(((x, y) -> sum(x,y)));

    }



    public static double sum(double x, double y){
        return (x+y);
    }
}
