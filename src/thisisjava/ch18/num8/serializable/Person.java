package thisisjava.ch18.num8.serializable;

import java.io.Serializable;

public class Person implements Serializable {
    //Serializable인터페이스는 멤버가없는 인터페이스지만
    //객체를 직렬화할수있는지 없는지에대한 표시를해주는 인터페이스이다.

    //객체가 직렬화 될때 인스턴스 필드값은 직렬화 대상이지만
    public int field1;
    int field2;
    protected int field3;
    private int field4;
    //정적 필드는 직렬화의 대상에서 제외된다.
    public static int field5; //제외대상
    //transient로 선언된 필드도 직렬화에서 제외
    transient int field6;  //제외대상

}
