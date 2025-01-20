package thisisjava.ch13.제네릭Test.quiz.num3;

public class Pair <K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    public Pair(K k , V v){
        this.key = k;
        this.value = v;
    }

}
