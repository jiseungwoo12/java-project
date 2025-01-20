package thisisjava.ch13.제네릭.test;

public interface Attackable <A>{
    
    //제네릭 타입을 이용해서 Attackable인터페이스의 추상메세드 attack()을 만들자
    //인터페이스를 구현한 클래스만 사용할수있는 무기장착코드
    A EquipWeapon();
    
}
