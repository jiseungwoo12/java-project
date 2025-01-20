package logicExample;

public class OrAnd {
    public static void main(String[] args) {
        //or 논리합의 논리연산
        //And 논리곱의 논리연산에 대해 알아보자
        //자바 프로그래밍에선 if문으로 논리를따진다
        boolean p = true;
        boolean q = false;
        //if문 참일시 블럭안에 있는 코드를 실행시킨다.
        if (p || q){ //or논리연산 둘중하나라도 참일시 참을 반환한다
            System.out.println("참입니다.!");
        }
        //and논리연산 둘다 참일시 참을 반환한다
        //p만 true이므로 이 if문의 조건식은 참이될수없다!
        if (p && q){
            System.out.println("참입니다");
            //else는 if문의 조건식이맞지않으면 false거짓이므로 if문을 넘어가 실행시킨다!
        }else
            System.out.println("거짓입니다.");
    }
}
