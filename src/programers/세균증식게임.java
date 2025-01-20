package programers;

public class 세균증식게임 {
    public static void main(String[] args) {
        int segun = solution(2,10);
        System.out.println(segun);
    }

    public static int solution(int n, int t) {
        double answer = Math.pow(n*t,2);
        return (int)answer;
    }

}
