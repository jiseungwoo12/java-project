package thisisjava.ch17_2.num1;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //of메서드를 쓰면 리스트의내용을 변경할수없는 상태가된다.
        //Arrays.aslist랑 동일
        List<String> list = List.of("지승우","지종우","지동산");



        //외부반복자
        //1번 인덱스를 이용하는 for문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        //2번 iterator
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            String name = listIterator.next();
            System.out.println(name);
        }
        System.out.println();

        //3번 for-each문 사용 여기서의 for-each도 하나씩가져와서 처리한다는의미다
        for (String s:  list){
            System.out.println(s);
        }
        System.out.println();
        //내부 반복자 스트림
        //스트림은 위에 외부반복자와 다르게
        //내부에서 람다식을 제공하여 데이터를 처리한다
        //단계1 스트림객체생성 Stream도 제네릭타입이므로 list에 들어간 요소타입 기준으로 생성해야한다.
        Stream<String> stream = list.stream();
        //단계2 foreach문에 람다식 집어넣기
        //foreach는 하나씩 가져와서 처리한다는 의미
        stream.forEach(item -> System.out.println(item));
    }
}
