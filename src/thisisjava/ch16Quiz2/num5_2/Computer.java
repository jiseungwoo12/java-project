package thisisjava.ch16Quiz2.num5_2;

public class Computer {
    public static Student[] students = {
            new Student("지승우",90,90),
            new Student("지종우",90,90),
            new Student("지동우",90,90)
    };

    public static double avg(Function<Student> f){
        double sum = 0;
        for (Student s : students){
            sum += f.apply(s);
        }
        double avg = sum/students.length;
        return avg;

    }



}
