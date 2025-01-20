package thisisjava.ch16_2.Exam06;

//import thisisjava.ch16_2.exam05.ParameterRambda.Comparable

public class Person {
    public void ordering(Comparable comparable){
        String a = "지승우";
        String b = "유진실";

        int result = comparable.compare(a,b);
        if (result < 0){
            System.out.println(a+"는"+b+"보다 앞에있습니다.");
        } else if (result == 0) {
            System.out.println(a+"는"+b+"랑 같습니다.");
        }else
            System.out.println(a+"는"+b+"보다 아래에있습니다");
    }
}
