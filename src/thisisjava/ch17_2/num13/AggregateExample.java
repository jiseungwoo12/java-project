package thisisjava.ch17_2.num13;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        //정수배열
        int intarr[] = new int[]{1,2,3,4,5};

        //count는 long이 반환타입이므로 long에 담아야한다
        //count는 원소의 개수를 의미한다.
        long count = Arrays.stream(intarr)
                .count();
        System.out.println("카운트:" +count);
        
        //findfirst() 첫번째 요소를 반환한다
        //첫번째 3의배수
        //리턴타입 OptionalXXX 스트림을 int타입으로 변환해야한다
        int firstNum = Arrays.stream(intarr)
                .filter(i->i%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의배수:"+firstNum);

        //최댓값 최소값 구하기
        int max = Arrays.stream(intarr)
                .filter(n->n%2==0)
                .max()
                //OptionInt는 comparable을 구현하고잇으므로 max메서드의매개변수에 구현을할필요없다.
                .getAsInt();
        System.out.println("최댓값:"+max);
        int min = Arrays.stream(intarr)
                .filter(i->i%2==0)
                .min()
                .getAsInt();
        System.out.println("최솟값:"+min);
        //2의 배수의 총합
        //sum()메서드는 리턴타입이 int long double로 되어있으므로
        //getAsInt와같은 메서드로 형변환을 시키지않아도된다.
        int sum = Arrays.stream(intarr)
                .filter(i->i%2==0)
                .sum();
        System.out.println("2의배수의 합꼐:"+sum);

        //2의 배수의 평균
        double avg = Arrays.stream(intarr)
                .filter(i->i%2==0)
                .average()
                .getAsDouble();
        System.out.println("2의배수 평균:"+avg);


    }
}
