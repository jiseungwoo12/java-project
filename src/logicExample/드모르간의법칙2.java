package logicExample;

public class 드모르간의법칙2 {
    public static void main(String[] args) {
        //(!p||q) && !(p&&q)
        //드 모르간의 법칙과 분배법칙을 이용해 식을 간단히 해보자
        //(!p||q)&& (!p||!q) //드모르간의법칙을이용해 식을쓰고
        //!p || (q&&!q)
        //!p || F
        //!p
        boolean p = true;
        boolean q = false;
        if ((!p||q)&&!(p&&q)){
            System.out.println("참");
        }else System.out.println("거짓");
        if (!p){
            System.out.println("참");
        }else System.out.println("거짓");
        
    }
}
