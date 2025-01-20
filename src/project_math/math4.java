package project_math;

public class math4 {
    public static void main(String[] args) {
        //이번에는 거듭제곱을 자바에서 표현할수있게해보자.
        //거듭제곱은 지정된 횟수만큼 숫자를 곱하는것이다.
        //2의3제곱 2*2*2 = 8
        //밑(base)는 거듭제곱하려는 변수 또는 값이며, 지수(exponent)는 밑을 곱하는 횟수이다.
        //2의 3제곱 2는 밑 3은지수
        //x의2제곱 * x의3제곱
        //x2x3
        //(x*x)(x*x*x) = x 2+3 = x5; 거듭제곱을 곱할때에는 위에 지수만 더해주면된다.
        //이것을 지수 법칙이라고한다.
        //x의2제곱 / x의3제곱  이것을 나누기해보자.
        //x-3 이된다. 1/x3 으로도 쓸수있다.

        //2를 거듭제곱해 8이되는 지수는?

        double d = mathlogMethod(2,8);  //밑이 2 결과 8 d의 값은 ?
        System.out.println(d);

        double d2 = mathlogMethod(10,Math.pow(100,2.5));
        System.out.println(d2);

        double d3 = mathmultiply(3,2,1);
        System.out.println(d3);

        double d4 = mathdivide(3, 3 ,  2);
        System.out.println(d4);

        double d5 = exponent(3,2,1);
        System.out.println(d5);
        double d6 = zeroExponet(3);
        System.out.println(d6);
        double d7 = reciprocal(2);
        System.out.println(d7);

    }

        public static double mathlogMethod(double x, double y){

        return Math.log(y) / Math.log(x);
        }

        public static double mathlog(double x,double y){

            return Math.log(y) / Math.log(x);
        }
        
        //x의n제곱 곱하기 x의m제곱
        public static double mathmultiply(double x, double n, double m){
            return Math.pow(x,n+m);
        }
        public static double mathdivide(double x, double n, double m){
        //x제곱n을 x제곱m로 나눈다
        return  Math.pow(x,n-m);
        }
        //거듭제곱
        public static double exponent(double x, double n, double m){
        return Math.pow(x,n*m);
        }
    public static double zeroExponet(double x){
        return Math.pow(x,0);
    }

        public static double reciprocal(double x){
                return Math.pow(x,-1);
        }
}
