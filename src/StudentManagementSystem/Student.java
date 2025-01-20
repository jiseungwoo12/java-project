package StudentManagementSystem;

public class Student {
    private String name;
    private int engscore;
    private int mathscore;

    // 생성자
    public Student(String name, int engscore, int mathscore) {
        this.name = name;
        this.engscore = engscore;
        this.mathscore = mathscore;
    }

    // Getter 메서드들
    public String getName() {
        return name;
    }

    public int getEngscore() {
        return engscore;
    }

    public int getMathscore() {
        return mathscore;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", English Score: " + engscore + ", Math Score: " + mathscore;
    }
}