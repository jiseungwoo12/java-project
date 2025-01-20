package thisisjava.ch13.제네릭.test;

public class Example {
    public static void main(String[] args) {

        //무기란 객체를만들고
        Weapon weapon = new Weapon();
        //Marine객체에 무기를 장착
        //<Marine>이란 제네릭타입으로 
        //Marine타입으로 반환하므로 마린클래스의참조변수에다 반환시켜야한다.
        Marine marine = weapon.EquipWeapon();
        //무기를 장착했으니 attack이란 메서드를 사용할수있다.
        marine.attack();
    }
}
