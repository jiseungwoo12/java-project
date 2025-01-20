package thisisjava.ch13.제네릭.method;

public class Box <T>{

    //필드
    private T t;

    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
