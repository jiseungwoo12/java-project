package thisisjava.ch18.num8.serialVersionUID;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {
    @Serial
    private static final long serialVersionUID = 7352576847223722878L;
    //이번시간에는 데이터(객체나 기본형)를 직렬화나 역직렬화할때
    //사용된 클래스는 기본적으로 동일한 클래스여야한다.
    //만약 클래스의 이름이 같더라도 내용이 다르면 역직렬화에 실패한다.
    //
    //ObjectoutputStream으로 직렬화를 한후 int score란 필드를 생성해보자
    //필드를 생성한후 프로그램에 입력을 한다면 InvalidClassException라는 예외가 발생하며 프로그램종료
    //왜냐 출력한 멤버의 내용과 입력받을때의 멤버의 내용이 다르기때문
    //내용과내용이 다르더라도 serialno 고유식별자를 설정하면 포함관계에서는 예외가발생하지않고
    //역직렬화를 할수있다.
    private String id;
    private String name;



    public Member(String id,String name){
        this.id = id;
        this.name =name;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    public String toString(){
        return "id: "+id + " \t name: " +name;
    }
}
