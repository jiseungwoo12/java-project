package java_jungsuk.Rambda.num2;

public class Example {
    public static void Function(Myfunction myfunction) {
        myfunction.aMethod();
    }

    public static void main(String[] args) {
        Myfunction f = ()-> System.out.println("a메서드호출합니다.");
        f.aMethod();
        //위 두문장을 합치면?
        Function(()->{
            System.out.println("a메서드를 호출합니다.");
        });

















    }
}
