package thisisjava.ch12.MathClass;

import java.util.Arrays;
import java.util.Random;

public class Random_class {
    public static void main(String[] args) {

        //util.Random클래스의 생성자
        //Random()매개변수가없는 생성자
        //현재시간을 이용해서 종자값을 자동생성한다
        //Random(int seed)
        //시드값을정해서 같으면 같은난수를 반환하고
        //다르면 시드에따라 다른난수를 제공한다.
        //밑에 예제에서 기본생성자사용과 seed를 같은값으로 주거나 다른값으로 줘보자
        //기본생성자일시 둘다 다른값으로 반환 seed가 같으면 같은난수 다르면 다른난수


        //선택번호  6자리
        int selectNumber[] = new int[6];
        Random random = new Random(1);  //선택번호의 시드와 당첨번호의 시드가 같으면 동일한값을 얻을수있다.
        System.out.println("선택번호");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45)+1;  //1부터 45의 수중에서 리턴
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        //당첨번호
        int winningNumber[] = new int[6];
        random = new Random(1);  //위에 시드랑 같은값을 주게되면 같은 난수를 얻는다. 다르게하면 다른시드에 저장되는
                                        //것이므로 다른 값이거나 운이좋으면 같은값을 얻게된다.
        System.out.println("당첨번호");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45)+1;
            System.out.print(winningNumber[i] +" ");
        }
        System.out.println();

        Arrays.sort(selectNumber);  //Arrays.sort 배열을 오름차순으로 변경
        Arrays.sort(winningNumber);

        System.out.println("당첨여부");
        boolean result = Arrays.equals(selectNumber,winningNumber);  //두 배열 비교 boolean으로리턴
        if (result){
            System.out.println("1등당첨");
        }
        else {
            System.out.println("미당첨");
        }
    }


}
