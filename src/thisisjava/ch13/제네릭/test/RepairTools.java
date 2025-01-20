package thisisjava.ch13.제네릭.test;

public class RepairTools implements Attackable <SCV>{

    @Override
    public SCV EquipWeapon(){
    return new SCV();
    }
}
