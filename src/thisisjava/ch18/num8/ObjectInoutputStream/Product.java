package thisisjava.ch18.num8.ObjectInoutputStream;

import java.io.Serializable;

public class Product implements Serializable {
    //만약 Object인아웃풋스트림으로 읽거나 출력할때 Serializable이없다면
    //.NotSerializableException 예외가 발생하면서 프로그램을 종료시킨다.
    private String name;
    private int price;

    public Product(String name,int price){
        this.name= name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "name: "+name+" \t price: "+price;
    }
}
