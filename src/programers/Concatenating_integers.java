package programers;

public class Concatenating_integers {

    public static void main(String[] args) {

          int sum = solution(5,7);
        System.out.println(sum);


    }

    //연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
    //
    //12 ⊕ 3 = 123
    //3 ⊕ 12 = 312
    //양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
    //
    //단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
    public static int solution(int a, int b) {
        //정수를 이어붙이려면 String문자열로 만들어야한다.

        String abs = a+""+b;  //문자열로 숫자만들기 정수를이어붙임. "ab"와같은형태가됨.
        int ab = Integer.parseInt(abs); //문자열을 다시 숫자로 변환
        String bas = b+""+a;
        int ba = Integer.parseInt(bas);

        if(ab>ba){
            return ab;
        }else{
            return ba;
        }
    }
}
