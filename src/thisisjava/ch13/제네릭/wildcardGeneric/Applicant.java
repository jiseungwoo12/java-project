package thisisjava.ch13.제네릭.wildcardGeneric;

public class Applicant<T> {
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}
