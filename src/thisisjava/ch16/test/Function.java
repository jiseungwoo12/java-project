package thisisjava.ch16.test;

@FunctionalInterface
public interface Function<T> {
    public double apply(T t);
}
