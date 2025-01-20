package thisisjava.ch17_2.num8;

import javax.print.DocFlavor;

public class Student {
    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score =score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}
