package thisisjava_note.객체지향노션;

public class Car {
   private Engine engine;
   private Tire tire;
   private Handle handle;

   public Car(){
    this.engine = new Engine();
    this.tire = new Tire();
    this.handle = new Handle();
   }
   
   //자동차의 기능
   public void RepairEngine(){
       engine.repair();
   }
   public void replaceTire(){
       tire.replace();
   }
   public void checkedHandle(){
       handle.check();
   }
}
//엔진
 class Engine{

     public void repair(){
         System.out.println("엔진을 수리합니다.");
     }

}
//타이어
class Tire{

    public void replace() {
        System.out.println("타이어를 교체합니다.");
    }

}
//핸들
class Handle{

    public void check(){
        System.out.println("핸들을 점검합니다");
    }

}

class TurboEngine extends Engine{
    @Override
    public void repair() {
        System.out.println("터보엔진을 수리합니다.");
    }
    public void boost(){
        System.out.println("터보 부스트 엔진을 사용합니다.");
    }
}
