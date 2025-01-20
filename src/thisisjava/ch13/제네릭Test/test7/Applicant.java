package thisisjava.ch13.제네릭Test.test7;

public class Applicant <T>{
    public T kind;

    public Applicant(T kind){
        this.kind = kind;
    }
}
