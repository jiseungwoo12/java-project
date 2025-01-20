package thisisjava.ch16.StaticandinstanceRambdaExamp.Exam01;



public class RambdaExample {
    public static void main(String[] args) {


        Person person = new Person();
        //정적 메소드일 경우
        //호출할메서드이름 (정적메서드를가지고있는클래스이름 :: 정적메서드이름
        person.action(Computer::staticMethod);

        //인스턴스 메소드일 경우
        //먼저 인스턴스메서드의 참조변수를 만들어야하므로 객체생성
        Computer computer = new Computer();
        //호출할메서드이름(호출할클래스의참조변수::호출할클래스의메서드이름)
        person.action(computer::instanceMethod);

    }
}
