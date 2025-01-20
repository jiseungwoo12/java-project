package thisisjava.ch15.Quiz.num9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Entry<String,Integer>> setEntry = map.entrySet();
        for (Entry<String,Integer> e : setEntry){
            if (e.getValue() > maxScore){
                name = e.getKey();
                maxScore = e.getValue();
            }
            totalScore += e.getValue();
        }

        int avgScore = totalScore/setEntry.size();
        System.out.println("평균점수 :" + avgScore);
        System.out.println("최고점수 :"+ maxScore);
        System.out.println("최고점수를 받은 아이디 :"+ name);



    }
}
