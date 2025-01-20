package thisisjava.ch13.제네릭Test.quiz.num2;

public class Container <A,B>{
    public A a;
    public B b;

    public void set(A a,B b){
        this.a = a;
        this.b = b;
    }
    public A getKey(){
        return a;
    }
    public B getValue(){
        return b;
    }
}
