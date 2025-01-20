package thisisjava.ch13.제네릭Test.quiz.num1;

public class Container <T>{
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
