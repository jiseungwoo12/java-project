package project_math;

public class math2 {
    public static void main(String[] args) {


        System.out.println(method(2));


    }
    //f(x) =  x2 +1;
    public static double method(double x){

        return Math.pow(x,2) + 1;
    }
    //f(x,y) = 2x + 3y
    public static int method2(int x, int y){
        return 2*x+3*y;
    }
}
