package thisisjava.ch13.제네릭Test.test7;

public class Course {
    //모든 사람이 등록할수있다.
    public static void registerCourse(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
    }
    //학생모두 등록할수있다. (middle , high student)
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2를 등록함");
    }
    //직장인 이거나 일반인 등록가능 학생 x
    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3를 등록함");
    }
}
