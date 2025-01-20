package thisisjava.ch13.제네릭Test.quiz.num3;

public class OtherPair <K,V>{
    private K key;

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    private V value;

    public OtherPair(K key, V value){
        this.key = key;
        this.value = value;
    }
}
