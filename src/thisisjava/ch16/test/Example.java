package thisisjava.ch16.test;

public class Example {
    public static void main(String[] args) {

        Student.students = new Student[]{
                new Student("지승우",80,90),
                new Student("지승우",80,90),
                new Student("지승우",80,90),
        };

        double avg =Student.avg(s->s.getEngscore());
        System.out.println(avg);
    }
}
