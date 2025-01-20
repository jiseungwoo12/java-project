package thisisjava.ch12.StringclassExample;

public class Stringbuilderclass {
    public static void main(String[] args) {

        //이번에는 StringBuilder 클래스에 대해서 알아보자.
        //StringBuilder는 문자열의 더하거나 빼기 저장 수정등이 용이하다
        //한번정하면 바꿀수없는 String과달리 수정이가능하다는것이다

        String str = "지승우";
        str += " 지종우"; //이렇게 스트링클래스로 뒤에문자열을 추가한다고 하자
        //기존의 str객체가 변하는것이아니라 string객체를 새로만들어 합친값을 저장한다.
        //str참조변수는 새로운 string객체를 참조하게되는것이다.
        //이렇게하면 메모리사용만 많아지고 더 느려진다.
//        System.out.println(str);

        //하지만 이문제를 StringBuilder가 해결해줄것이다
        //StringBuilder는 String의 자식클래스이므로 String변수에 담을수있다.
        String str2 = new StringBuilder() //이렇게말이다.

                .append("지승우").append("지승우").toString();
        //마지막엔 toString메서드를 사용해주어야한다. string객체인 str2에 stringbuilder클래스객체를 담는것이기
        //때문이다. 그러면 Stringbuilder를통해 사용한 append (추가)를 통해 문자열을 추가하고
        //String클래스객체에 깔끔하게 담는것이다.
//        System.out.println(str2);
            //이 문자열이 잘못입력되거나 수정하고싶을경우에는 다시 stringBuilder클래스를 이용하면된다
            //하지만 새로운 StringBuilder클래스의 객체가 생성되는것으로 이전값은 사라지게된다.
        str2 = new StringBuilder()
                .append("지종우").append("지종우").toString();

        System.out.println(str2);



    }
}
