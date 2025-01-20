package programers;

public class Math_test1 {
    public static void main(String[] args) {

        int str = solution(new int[] {3,4,5,2,1});
        System.out.println(str);

    }
    public static int solution(int[] num_list) {
        int multysum = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multysum *= num_list[i];
        }
        sum = (int)Math.pow(sum,2);

        System.out.println(multysum);
        System.out.println(sum);
        if (sum > multysum){
            return 1;
        }else {
            return 0;
        }
    }


}
