package thisisjava.ch16_2.Exam06;


//import thisisjava.ch16_2.exam05.MethodRambda.Person;

public class RambdaRefrenceExam {
//    Person person = new Person();
public static void main(String[] args) {
    Person person = new Person();
    //매개변수 a를 비교하여리턴
    person.ordering((a,b)->{return a.compareTo(b);});

    person.ordering(String::compareToIgnoreCase);
}
}
