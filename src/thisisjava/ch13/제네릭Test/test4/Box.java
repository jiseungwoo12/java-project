package thisisjava.ch13.제네릭Test.test4;

public class Box <T>{
    public T content;

    public Box(T content){
        this.content = content;
    }
    public boolean compare(Box<T> other){
        return this.content.equals(other.content);
    }

}
