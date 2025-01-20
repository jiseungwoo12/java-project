package thisisjava.ch16.test;

public class Student {
    private String name;
    private int engscore;
    private int mathscore;
    public static Student[] students = null;

    //avg메서드
    public static double avg(Function<Student> f){
        double sum = 0;
        for (Student s : students){
            sum += f.apply(s);
        }
        return sum/students.length;
    }

    public String getName() {
        return name;
    }

    public int getEngscore() {
        return engscore;
    }

    public int getMathscore() {
        return mathscore;
    }

    public Student(String name, int engscore, int mathscore){
        this.name = name;
        this.engscore =engscore;
        this.mathscore =mathscore;
    }

}
