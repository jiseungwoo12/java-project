package thisisjava.ch15.TreeSetExample;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExam {
    public static void main(String[] args) {
        //Treeset객체생성
        //Treeset도 제네릭타입
        TreeSet<Integer> scores = new TreeSet<>();
        //트리셋은 이진트리를 기반으로한 set컬렉션이다. 이진트리는 여러개의 노드가 트리형태로 연결된구조
        //하나에 노드에서 시작해 각 노드에 최대 2개의 노드를 연결할수있는 구조s
        scores.add(73);
        scores.add(40);
        scores.add(50);
        scores.add(90);
        scores.add(100);
        scores.add(80);
        //TreeSet도 iterable을 구현하고있기 때문에 향상된for문에서 읽을수있다.
        //TreeSet은 부모노드에서 left왼쪽값에는 작은값 right오른쪽에는 큰값을 저장해
        //예 add를할시 40 50 73 90 100 수능로 left right에 저장된다.
        //자식->부모->자식순으로 읽어 오름차순으로 값을 정렬한다.
        for (int i : scores){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        //특정 integer객체를 가져오기
        System.out.println("가장 낮은 점수: "+ scores.first()); //제일 낮은객체를 리턴
        System.out.println("가장 높은 점수: "+scores.last());  //제일 높은객체를 리턴
        System.out.println("95점 아래 점수: "+scores.lower(95));
        System.out.println("95점 위의 점수: "+scores.higher(95));
        System.out.println("95점이거나 바로아래점수: "+scores.floor(95));
        System.out.println("85점이거나 바로위에점수: "+scores.ceiling(85));

        //내림차순으로 정렬하기  큰값부터 작은값까지
        //NavigableSet<> 타입도 제네릭타입이므로 내림차순으로 변경할 treeset의 제네릭타입을 사용
        NavigableSet<Integer> set = scores.descendingSet();
        for (int s : set){
            System.out.print(s + " ");
        }
        System.out.println("\n");
        //범위 검색(80 >= )
        //NavigableSet<E> headSet(E toElement, boolean inclusive)
        //주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴 포함여부는 두번째 inclusive의
        //여부에따라 달라짐 true면 포함 false면 포함x
        NavigableSet<Integer> rangeset = scores.headSet(80,true);
        for (int i : rangeset){   
            System.out.print(i+" ");  //이처럼 inclusive에 true로 설정하면
                                    //80>=값을 얻을수있다 같거나 낮은값
        }
        System.out.println("\n");

        //이번엔 NagableSet<>을 통해 80<=값을 구해보자 80보다 높은값
        //tailSet()메서드 사용법은 위에 headSet과 동일함
        NavigableSet<Integer> tailset = scores.tailSet(80,true);
        for (int i : tailset){
            System.out.print(i+" ");

        }
        System.out.println("\n");

        //범위검색 (80<= score < 90)
        //subset(fromElement 80보다 크거나 fromInclusive 같으며 toElement 90보다작거나 포함하지않는값
        NavigableSet<Integer> subset = scores.subSet(80,true,90,false);
        for (int i : subset){
            System.out.println(i);
        }

    }
}
