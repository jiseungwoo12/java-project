package java_jungsuk.Rambda.num1;

@java.lang.FunctionalInterface
interface Function{
    int max(int a, int b);
}



public class FunctionalInterface {
    public static void main(String[] args) {
        Function function = new Function() {
            public int max(int a, int b){
                return a<b?a:b;
            }
        };
        int big = function.max(5,10);
        System.out.println(big  );
    }
}
