package thisisjava.ch13.Quiz.num1;

public class Container <T, S>{
    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

}
