package thisisjava.ch13.제네릭.method;

import thisisjava.ch13.제네릭.method.Box;

public class GenericExample {
    public static <T>Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        Box<String> box = boxing("hello");
        String boxstr = box.get();
        System.out.println(boxstr);


    }
}
