package programers;

public class 모든자연수의합 {

    public static void main(String[] args) {

        int test = solution(new String("hleelelwl12323213"));
        System.out.println(test);

    }


    public static int solution(String my_string) {
        int sum = 0;
        for(int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c>0 && c<10){
                sum += c;
            }
        }
        return sum;
    }
}
