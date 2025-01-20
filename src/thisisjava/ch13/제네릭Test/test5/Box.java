package thisisjava.ch13.제네릭Test.test5;

public class Box <T>{
    private T t;

    public void setbox(T t){
        this.t = t;
    }
    public T getBox(){
        return t;
    }
}
