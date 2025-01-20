package thisisjava.ch17_2.num18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParrallelStreamExample {
    //이 예제는 1억개의 점수에 대한 평균을 얻을때
    // 일반스트림과 병렬처리스트림의 시간차이를 알아보기위함
    //1. 랜덤 난수의값을 점수값에 저장하기위해 Random클래스객체를 생성한다.
    public static void main(String[] args) {


        Random random = new Random();

        //2번 리스트를 생성한후 리스트에 for문으로 1억개의 1~100까지의 랜덤점수를 넣어준다
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < 100000000; i++) {
            scores.add(random.nextInt(101));
            //101로 랜덤값을 지정하는이유는 인덱스 0부터 시작하기때문이다
        }

        //3번 시간과 평균값을 담기위한 변수 선언
        double average = 0.0;
        long starttime = 0;
        long endtime = 0;
        //시간을구하는방법은 시작시간 - 끝난시간 으로 구해야하므로
        //time변수를 하나 만들어준다
        long time = 0;

        //4번 이제 하나의 코어만을 동시성으로 처리하는 기본스트림을 만들어 시간을 구해본다.
        Stream<Integer> stream = scores.stream();
        starttime = System.nanoTime();
        average = stream
                .mapToInt(i -> i.intValue())
                .average()
                .getAsDouble();
        endtime = System.nanoTime();
        time = endtime-starttime;
        System.out.println("평균값:"+average+" - "+"걸린시간: "+time);

        //이제 병렬처리스트림을 만들어 시간값을 비교하면된다.

        Stream<Integer> parrallelStream = scores.parallelStream();
        starttime = System.nanoTime();
        average = parrallelStream
                .mapToInt(i->i.intValue())
                .average()
                .getAsDouble();
        endtime = System.nanoTime();
        time = endtime-starttime;
        System.out.println("평균점수:"+average+"-- 걸린시간:"+time);

        //이처럼 기본스트림과 병렬스트림의 평균값 계산에는 차이가없지만
        //병럴처리를하여 여러개의 코어로 방대한 작업을 할 경우에는
        //병렬처리의 시간이 훨신 효율적이라는 것을 알수가있다.
    }
}
