package thisisjava.ch15.MapCollection.ShoppingCart;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class num1 {
    public static void main(String[] args) {
        //쇼핑몰에서 장바구니 시스템에서 Map컬렉션으로 비어있는지 확인하고
        //삭제하는 예제
        Map<String,Integer> shoppingmap = new HashMap<>();
        shoppingmap.put("사과",2);
        shoppingmap.put("돼지고기",3);

        //물건을 구매하는 홈페이지로 가고싶다면?
        if (shoppingmap.isEmpty()){ //장바구니에 물건이없으면 결제창으로가지못하므로
            System.out.println("장바구니에 물건이없습니다.");
        }else {
            System.out.println("결제창으로 이동합니다."); //물건이잇을시 결제창으로감.
        }
        //Map의 size()메서드
        //내가 산 물건의 개수 //물건 key 개수 value
        int cart = shoppingmap.size();
        //키 Set컬렉션을 얻고 반복해서 키와 값얻기
        Set<String> keyset = shoppingmap.keySet();
        Iterator<String> iterator = keyset.iterator();
        String thing;
        int num;
        int sum = 0;
        System.out.print("장바구니에 있는 물건의 총개수: ");
        while(iterator.hasNext()){
            thing = iterator.next();
            num = shoppingmap.get(thing);
            sum += num;
        }
        System.out.println(sum);
        //장바구니에 있는 모든 물품들을 제거하고싶다?
        //clear()메서드를 사용하면 된다.
        //일단 장바구니가 비어있는지 확인
        if (shoppingmap.isEmpty()){
            System.out.println("장바구니가 비어있습니다.");
        }else{
            shoppingmap.clear();
            System.out.println("장바구니를 비웁니다");
            int size = shoppingmap.size();
            System.out.println("장바구니 물품개수 : "+ size);
        }





    }
}
