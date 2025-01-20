package thisisjava.ch18.num8.ObjectInoutputStream;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String name;

    public Member(String id,String name){
        this.id = id;
        this.name =name;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    public String toString(){
        return "id: "+id + " \t name: " +name;
    }
}
