package thisisjava.ch12.MathClass;

public class math1 {
    public static void main(String[] args) {
        //절대값 0이상일땐 x그자체가 절대값이고
        //x가 음수일때 x는 부호를 반대로하여 양수를 만든값이 절대값이다.
        //Math.abs  //리턴값 int double 다있음.
        int a = Math.abs(-5);
        System.out.println(a); //-5가 +5로 양수로바뀜

        //올림값 소숫점단위에서 정수로 올림한다.
        //Math.ceil()  //리턴값 double
        double a2 = Math.ceil(3.3);
        System.out.println(a2); //4.0
        //버림값 소숫점을 버린값
        //Math.floor  //리턴값 double
        double a3 = Math.floor(3.3);
        System.out.println(a3);  //3.0

        //Math.random() 0.0~1.0까지의 임의의 정수를 반환  double 리턴값
        //1부터 10까지의 랜덤값을 a4에 저장함  (int)로 형변환
        int a4 = (int)(Math.random()*10)+1;   //+1을해주는이유 10의값은 포함되지않기때문에 +1 해서 11로만듬
                                                // 1>=random값>11  이렇게된다.

        //Math.round() 반올림값
        double a5 = Math.round(3.6);  //반올림하여 4.0
        double a6 = Math.round(3.3); //반내림 3.0
        System.out.println(a5);
        System.out.println(a6);
        
        //Math.max() 최댓값
        //Math.min() 최솟값





    }
}
