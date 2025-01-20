package thisisjava.ch16_2.exam05.ParameterRambda;

public class Person {
    public void ordering(Comparable comparable){
        String a = "지승우";
        String b = "지종우";
        int result = comparable.compare(a,b);

        if (result<0){
            System.out.println(a+"은 "+b+"보다 앞에 옵니다.");
        } else if (result == 0) {
            System.out.println(a+"은 "+b+"랑 같습니다.");
        }else
            System.out.println(a+"은 "+b+"보다 뒤에 옵니다.");
    }
}
