package thisisjava.ch17_2.num4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new Product("제품"+i,i,"지승우회사",(int)(10000*Math.random())));
        }

        Stream<Product> stream = list.stream();
        stream.forEach(product -> System.out.println(product));

    }


}
