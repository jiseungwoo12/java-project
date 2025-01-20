package thisisjava.ch16Quiz2.num3;



public class Example {
    public static double calc(Function fun){
        double x = 10;
        double y = 4;
        return fun.apply(x,y);
    }
    public static void main(String[] args) {

        double result1 = calc((x,y)->x+y);
        System.out.println(result1);
        double result2 = calc((x,y)->(x/y));
        System.out.println(result2);



    }
}
