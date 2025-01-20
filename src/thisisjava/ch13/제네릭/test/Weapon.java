package thisisjava.ch13.제네릭.test;

public class Weapon implements Attackable<Marine>{

    @Override
    public Marine EquipWeapon(){
        return new Marine();
    }
}
