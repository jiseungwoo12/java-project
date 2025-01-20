package logicExample;

public class Not {
    public static void main(String[] args) {
        //이번에는 Not 논리연산에 대해알아본다
        //Not논리연산은 참과 거짓을 뒤바꾸는 논리연산이다
        boolean p = true;
        boolean q = false;
        if (!p){  //이처럼 !p를하면 true가 뒤바뀌어 false가 되어버린다
            System.out.println("참입니다");
        }else{
            System.out.println("거짓입니다");
        }
    }
}
