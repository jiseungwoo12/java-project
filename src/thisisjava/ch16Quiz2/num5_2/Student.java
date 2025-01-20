package thisisjava.ch16Quiz2.num5_2;

public class Student {
    public String getName() {
        return name;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    private String name;
    private int engScore;
    private int mathScore;

    public Student(String name, int engScore, int mathScore){
        this.name = name;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }


}
