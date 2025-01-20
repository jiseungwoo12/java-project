package thisisjava.ch14.sec05.exam01;

import thisisjava.ch13.제네릭.test.Example;

public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }
    //메소드 전체와 객체를 잠금하는방법 메서드 리턴타입 앞에다 synchronized를 붙인다.
    public synchronized void setMemory1(int memory){
        this.memory = memory;
        try {
            Thread.sleep(2000);
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName()+ " : " +this.memory);
    }
    //이번에는 메소드의 일부분만 잠금(동기화)처리하고싶다면?
    public void setMemory2(int memory){
        //.... ...부분부터 ...까지 동기화를 시키기고싶다
        synchronized (this){   //동기화 블럭 선언. 동기화블럭안에다 동기화할 내용을 적는다.
            this.memory = memory;
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(Thread.currentThread().getName()+ " : " +this.memory);
        }
        //이처럼 동기화블럭을 사용하여 동기화될내용을 실행할경우
        //위 1메서드와 동일한 결과를 얻을수있다.
        //이 메서드는 동기화하여 이 set설정된 필드값을 출력하는 메서드이다.
        //이메서드의 변경된필드값을 출력하고 다른스레드의 값도 수정하여 값이 다른 값을 출력한다.
        //메서드 전체 동기화와 메서드 일부동기화를 하는방법을 알아보았다.
        //이로써 동기화는 동기화된메서드를 호출시 그메서드가 끝날때까지 이 객체가 잠김으로서
        //필드 수정등 불가피해진다.
        //싱크로니즈 메서드가 끝나면 잠금이 해제되며 다른메서드와 필드값을 변경할수있다.
        //
    }



}
