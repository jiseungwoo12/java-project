package DesignPatternStart.num1.DesignPuzzle;
interface WeaponBehaivior{
   void useWeapon();
}
class KnifeBehaivior implements WeaponBehaivior{
    public void useWeapon(){
        System.out.println("칼로 벱니다.");
    }
    public String toString(){return "칼";}
}class BowandArrowBehaivior implements WeaponBehaivior{
    public void useWeapon(){
        System.out.println("활을 쏜다.");
    } public String toString(){return "활";}
}class AxeBehaivior implements WeaponBehaivior{
    public void useWeapon(){
        System.out.println("도끼로 찍는다.");
    } public String toString(){return "도끼";}
}class SwordBehaivior implements WeaponBehaivior{
    public void useWeapon(){
        System.out.println("검을 휘두른다");
    }
    public String toString(){return "검";}
}
public abstract class Character {
    WeaponBehaivior weaponBehaivior;

    public static boolean isLetter(char c) {
        return false;
    }

    public abstract void fight();

    public void setWeaponBehaivior(WeaponBehaivior wb){
        weaponBehaivior = wb;
        System.out.println(wb+"을 장착합니다.");
    }
}
class Queen extends Character{

    
    public void fight(){
        System.out.println(weaponBehaivior+"을쏩니다.");
    }
}
class King extends Character{
    public King(){
        weaponBehaivior = new KnifeBehaivior();
    }
    public void fight(){
        System.out.println(weaponBehaivior+"을찌릅니다.");
    }
}
class main{
    public static void main(String[] args) {
        Queen queen = new Queen();
        System.out.println("무기가없습니다 장착해주십시오");
        queen.setWeaponBehaivior(new BowandArrowBehaivior());
        queen.fight();
    }
}
