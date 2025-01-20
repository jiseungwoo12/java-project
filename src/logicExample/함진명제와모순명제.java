package logicExample;

public class 함진명제와모순명제 {
    public static void main(String[] args) {
        //함진명제의 뜻은 논리연산의 결과가 항상 참을뜻
        //모순명제의 뜻은 논리연산의 결과가 항상 거짓을 뜻한다.
        boolean p = true;
        boolean q = false;
//        if (!p) 이것은 거짓을 반환한다
        //그렇다면 이것은?
//        if (!q) 이것은 false에서 true로 바뀐다
        //항진명제
        //항상 참이다
        //이코드는 항상 참이될수밖에없다
        //둘중에하나만 참이여도 참 p가 true면참 false여도 참!
        if (p || !p){
            System.out.println("참입니다");
        }else
            System.out.println("거짓입니다.");
        //모순명제?
        if (p && !p){ //이 논리연산은 항상 거짓이될수밖에없다
            //왜냐 p && !p 둘다 참이여야지 참이될수있는 and논리연산이기때문에그렇다
            //p가 true라면 !p는 false이기때문이다.
            System.out.println("참입니다.");
        }
        System.out.println("거짓입니다.");
        //부정 not을 연산한 결과를 다시 부정 연산하면 원래 명제의 진리값으로 돌아간다?
        //그렇다 !!을 붙이면 not논리연산이 두번들어간것이므로 true->false->true값으로 명제의진리값으로됨
        if (!!p){
            System.out.println("참입니다.");
        }else 
        System.out.println("거짓입니다");

        //명제를 연산한 결과에 부정 연산을하면 어떻게 될까?
        //p||q는 true p가 true라서 q는 false
        //하지만 true를 다시 ! not논리연산으로 연산을하면? 당연히 false가된다
        if (!(p||q)){
            System.out.println("참입니다");
        }else System.out.println("거짓입니다.");
        //이 반대로 p랑 q가 둘다 false이면 참의값을 가지게된다
        //false||false == false !false == true ok
        boolean p1 = false;
        boolean q1 = false;
        //이렇게 둘다 false로 값을줘서 확인해보자
        if (!(p1 || q1)){
            System.out.println("참");
        }else System.out.println("거짓");
        //참이나오는것을 확인해볼수있다.
        //이런 논리를 식으로 나타내보면 이것과같다
        //둘중하나가 true이면 false를 나타내고
        if (!p && !q){
            System.out.println("참입니다.");
        }else
        System.out.println("거짓입니다");
        //이거는 둘다 false일시 참을 나타낸다!
        //왜냐? !p1은 false에서 true로 !q1은 false에서 true로 바뀐값을 and
        //논리연산 둘다 true이므로 true를 반환한다!
        if (!p1 && !q1){
            System.out.println("참입니다.");
        }else
            System.out.println("거짓입니다");
        
        //이로써 if (!(p1 || q1)) (!p1 && !q1) 도 동일하고
        //if (!p && !q) (!(p||q)) 동일하니깐
        //!(p || q) == !p&&!q랑 동일하다는 뜻이다
        //이처럼 같은 진리값을 가지는 두명제를 동치라고하고 기호 = 작대기세개로 나타낸다.

        //유사한 방식으로 논리곱연산을 부정연산하면?
        //p는 true q는 false
        //&& 연산은 false지만 !를 붙이므로 true
        if (!(p && q)){
            System.out.println("참");
        }else
        System.out.println("거짓");
        //!p false !q true이므로 논리연산의결과는 true
        if (!p || !q){
            System.out.println("참");
        }else
            System.out.println("거짓");
        //이 두개의 동치관계는 특별히 드 모르간의 법칙! 으로불리며 복잡한 논리식을 계산할때 유용하다.


    }
}
