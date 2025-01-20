package thisisjava.ch13.제네릭.wildcardGeneric;

public class GenericExample {
    public static void main(String[] args) {

        //모든사람이 신청가능
        //모든사람이 신청가능한 1메서드의 매개변수값의 파라미터값을 Person이라 지정하면
        //모든 사람이 전부다 들어올수있다.
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Person>(new Middlestudent()));
        Course.registerCourse1(new Applicant<Person>(new Student()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        //오류나는이유. new Applicant<Middlestudent>라고 지정했으면 Middlestudent만 생성자에대입될수있으므로
//        Course.registerCourse1(new Applicant<Middlestudent>(new Student()));
        
        //학생만 신청가능한 메서드
        //new Applicant<?> ?파라미터에 Student나 그 자식들만 들어올수있게 extend로 제한된
        //메서드이므로 Person이나 Worker가 들어올수없다.
        Course.registerCourse2(new Applicant<Student>(new Student()));
        //이렇게도가능하다
        Course.registerCourse2(new Applicant<Student>(new Middlestudent()));
        //이렇겐안된다.
//        Course.registerCourse2(new Applicant<Middlestudent>(new Student()));

        
        //일반인과 직장인만 참여할수있는메서드
        Course.registerCourse3(new Applicant<Person>(new Person()));



    }
}
