package thisisjava.ch13.제네릭Test.quiz.num3;

public class Util {
    public static <K, V> Pair<? extends K,V> getValue(Pair<? extends K, V> pair, K k) {
        boolean result = k.equals(pair.getKey());
        if (result) {
            return pair;  // 키가 일치하면 pair 리턴
        } else {
            return null;  // 키가 일치하지 않으면 null 리턴
        }
    }
}
