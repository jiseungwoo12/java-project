package thisisjava.ch13.제네릭Test.test7;

public class Example {
    public static void main(String[] args) {

        //모든사람이 등록할수있다
        Course.registerCourse(new Applicant<Person>(new Student()));
        //학생만 등록가능하다.
        Course.registerCourse2(new Applicant<Student>(new MiddleStudent()));
    }
}
