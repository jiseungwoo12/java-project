package thisisjava.ch15.MapCollection.HashMapExam;

import java.util.HashMap;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        //hashmap은 키로 사용할 객체가 hashcode() 메소드의 리턴값이 같고
        //equals메소드가 true를 리턴할경우 동일키로보고 중복 저장을 하지않는다. (key)가 중복 x

        //Map<k,v> map = new HashMap<>(); //이런식으로 객체를 생성한다.
        //k,v는 제네릭타입 key와 value(값) 이므로 아이디 패스워드 이런식으로 활용이많이된다.
        Map <String,String> map = new HashMap<>();
        //Map에 Entry(key+value)를 합친객체를 추가하려면
        //V put(K key,V value) 메서드를 사용해주면된다.
        map.put("wltmddn","wltmddn159");  //아이디 비밀번호 k v
//        map.put("wltmddn","wltmddn159");  //아이디(키)가 중복시 생성되지않는다.
        map.put("wlwhddn","wltmddn159");  //비밀번호 value는 같아도 key값만 다르다면 생성가능
        map.put("wltmddn159","wltmddn159"); 
        
        //주어진 키가 있는지 여부를 확인함
        //boolean containsKey(Object key)
        if (map.containsKey("wltmddn")){
            System.out.println("해당 아이디는 이미 사용중입니다.");
        }else {
            System.out.println("만들수있는 아이디입니다!");
        }

        if (map.containsKey("wltmddn")){
            //boolean containsValue() 값 value를 비교할때사용 주로 아이디와패스워드입력시 사용.
            if (map.containsValue("wltmddn159")){
                System.out.println("로그인되었습니다.");
            }else {
                System.out.println("패스워드 입력오류입니다.");
            }
        }else {
            System.out.println("아이디가 올바르지않습니다.");
        }
        //총 엔트리수 entrysize
        int size = map.size();
        System.out.println("map의 entry개수 : " +size);

        //V get(Object key)  주어진 키의 value(값)을 리턴
        //V는 제네릭타입이므로 map객체의 value제네릭 타입으로 받으면된다.
        String key = map.get("wltmddn");  //value는 String으로 선언되었으므로 String객체로받는다.
        System.out.println(key); //아이디를 입력하면 패스워드값 얻기! //비밀번호찾기 이런경우일때 자주사용

        //boolean isEmpty()
        //주로 V remove() 주어진키와 일치하는 Map.Entry삭제를 할때사용
        if (map.isEmpty()){

        }
        




        //Set<Map.Entry<K,V>> entrySet()
        //키와 값의 쌍으로 이루어진 entry객체를 set에다 담아서 리턴
//        Set<String>





    }
}
