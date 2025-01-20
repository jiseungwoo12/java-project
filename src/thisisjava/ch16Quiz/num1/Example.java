package thisisjava.ch16Quiz.num1;

public class Example {
    private static Student[] students = {
            new Student("지승우",90,90),
            new Student("지승우",90,90),
            new Student("지승우",90,90)
    };

    public static double avg(Function<Student> function){
        int sum = 0;
        for (Student student : students){
            sum+= function.apply(student);
        }
        double avg = (double)sum /students.length;
        return avg;
    }
    public static void main(String[] args) {
        double englishavg = avg(s->s.getEnglishScore());
        System.out.println("영어점수 :" + englishavg);
    }
}
