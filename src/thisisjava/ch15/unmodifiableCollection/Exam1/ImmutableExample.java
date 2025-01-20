package thisisjava.ch15.unmodifiableCollection.Exam1;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {
    public static void main(String[] args) {
        //이번에는 수정할수없는 컬렉션을 만들어보겠다
        List<Snack> list = new ArrayList<>();
        list.add(new Snack("젤리",5));
        list.add(new Snack("초콜릿",6));
        list.add(new Snack("과자",2));
        list.add(new Snack("아이스크림",3));


        for (Snack s: list){
            System.out.println(s.snackname+"-"+s.snackno);
        }
        //수정할수없는 컬렉션 만들기
        //List는 list set은 set map은 map에다 저장
        List<Snack> imutablelist = List.copyOf(list);
//        imutablelist.add(new Snack("젤리",10)); //추가하려고할시.
        //ImmutableCollections.java:142) 예외를 발생시킨다.




       
    }
}
