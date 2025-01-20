package thisisjava.ch17_2.practice.Collec3;

public class Student {
    //이클래스에는 이름,성별,점수가 구성되어있다
    //람다식을 이용하려고하므로 getter가 필요하다
    private String name;
    private String sex;
    private int score;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, String sex, int score){
        this.name = name;
        this.sex =sex;
        this.score =score;
    }
}
