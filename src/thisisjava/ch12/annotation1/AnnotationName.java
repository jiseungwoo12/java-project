package thisisjava.ch12.annotation1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//어노테이션 적용대상
//@Target({})
//괄호안에 중괄호가 들어가는이유
//Target은 값으로 ElementType배열을 리턴하므로 배열의 값을 집어넣으려면 {}로 나누어
//넣어야하기때문이다
//이렇게 타겟으로 지정한 어노테이션은 이 타겟에 선언된 ElementType의 배열에 값만 적용할수있게
//되어버린다. 적용대상을 지정하는것이다.
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface AnnotationName {
    //클래스를 생성할때 Annotation을 클릭하여 생성한다
    //어노테이션에는 속성을 넣을수있다. 속성이란 필드와같은 값을 말한다 추상 x
    //속성이란 타입과 이름으로 구성되며 이름 옆에 ()를 붙인다.
    String name();  
    //속성은 default로 기본값을 지정할수있다
    //age()속성에 1값을 지정한다는의미
    int age() default 1; 
    
    
    
}
