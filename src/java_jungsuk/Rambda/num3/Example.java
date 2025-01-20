package java_jungsuk.Rambda.num3;

public class Example {
    static Myfunction getMyfunction(){
        return ()->
            System.out.println("달립니다.");
    }
    public static void startRun(Myfunction myfunction){
        myfunction.run();
    }

    public static void main(String[] args) {
        Myfunction f = getMyfunction();
        f.run();
       startRun(()-> System.out.println("달립니다."));
    }
}
