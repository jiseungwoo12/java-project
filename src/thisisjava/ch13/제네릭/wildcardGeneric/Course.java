package thisisjava.ch13.제네릭.wildcardGeneric;

public class Course {
    //모든 사람이면 등록가능
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
    //학생
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
    //직장인이거나 일반인
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName());
    }
}
