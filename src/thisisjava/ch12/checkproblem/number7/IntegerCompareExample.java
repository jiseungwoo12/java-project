package thisisjava.ch12.checkproblem.number7;

public class IntegerCompareExample {
    public static void main(String[] args) {

        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;


        //정수캐싱 Integer Caching
        //효율적인 메모리 사용을위해 -128에서 127까지의값에 대해 Integer객체를 재사용하므로
        //이 범위의 값은 항상 같은 객체를 참조하게 되며 이를 통해 메모리를 절약하고 성능을개선함
        System.out.println(obj1 == obj2);  //객체 == 객체는 객체의 주소값을 비교한다
        //이 코드는 127을 넘은 300 300을 비교하는코드이므로 둘다 다른객체임을 알수있다
        //그래서 결과는 false이다
        System.out.println(obj3 == obj4);

    }
}
