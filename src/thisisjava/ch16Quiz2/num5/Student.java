package thisisjava.ch16Quiz2.num5;

public class Student {
    private String name;
    private int engscore;
    private int mathscore;

    public Student(String name,int engscore,int mathscore){
        this.name = name;
        this.engscore = engscore;
        this.mathscore = mathscore;
    }
    public String getName(){
        return name;
    }
    public int getengscore(){
        return engscore;
    }
    public int getMathscore(){
        return mathscore;
    }
}
