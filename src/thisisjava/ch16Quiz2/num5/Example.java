package thisisjava.ch16Quiz2.num5;

public class Example {
    private static Student[] students = {
            new Student("지승우",100,100),
            new Student("지종우",80,90),
            new Student("유진실",95,95)
    };

    public static double avg(Function<Student> function){
        double result = 0;
        for(Student s : students){
            result += function.apply(s);
        }
        double avg = result/students.length;
        return avg;
    }

    public static void main(String[] args) {

        double result1 = avg((s)->s.getengscore());
        System.out.println(result1);
        double result2 = avg((s)->s.getMathscore());
        System.out.println(result2);

        //위 두 람다식을 메서드참조로 변경하기

        double result3 = avg(Student :: getengscore);
        double result4 = avg(Student::getMathscore);











    }
}
