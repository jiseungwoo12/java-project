package thisisjava.ch13.제네릭.num2;

public class Product <A,B>{

    private A kind;
    private B model;

    public A getKind(){
        return this.kind;
    }
    public B getModel(){
        return this.model;
    }
    public void setKind(A kind){
        this.kind = kind;
    }
    public void setModel(B model){
        this.model = model;
    }

}
