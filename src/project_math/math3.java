package project_math;

public class math3 {
    public static void main(String[] args) {

        //원소들을 더하는 합계 기호 시그마 {
        //이것을 for문으로할수잇다
        //1부터 5까지의 각 숫자에 2를 곱한다음 이를 모두 더하는경우
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i*2;
//            System.out.println(i*2);
//        }
//        System.out.println(sum);

        //이번에는 크기가 n인 숫자 배열을 반복하면서 각 숫자에 10을 곱한다음 모두 더하기
        int n[] = new int[] {1,2,3,4,5,6,7};
        int sigma = sigmamethod1(n);
        System.out.println(sigma);


    }
    public static int sigmamethod1(int [] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i]*10;
            System.out.println(sum);
        }
        return sum;
    }
}
