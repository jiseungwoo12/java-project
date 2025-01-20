package thisisjava.ch16_2.Test.num4;

public class Example {
    private static int[] scores = {10,50,3};
    public static int maxORmin(Operator operator){
        int result = scores[0];
        for (int score : scores){
            result = operator.apply(result,score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxORmin(Math::max);
        System.out.println("최대값: "+max);
        int min = maxORmin(Math::min);
        System.out.println("최솟값: "+min);
    }
}
