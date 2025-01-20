package thisisjava.ch15.VectorExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VertorExample {
    public static void main(String[] args) {

        //벡터로 리스트객체생성
        //벡터클래스는 내부에있는 메서드가 모두 syncronized되어있기(동기화) 때문에
        //그 메서드 add() 같은것들이 모두 끝날때까지 클래스를잠구고 다른작업을 할수없게만들기때문에
        //remove삭제나 수정 추가 작업들이 그 메서드가 실행이 다될때까지 멈춘다.
        List<Board> list= new Vector<>();

        Thread thread = new Thread(){
            @Override
            public void run(){
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }

        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
                }
            }
        };
        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();

        }catch (Exception e){}

        //저장된 총 객체 수 얻기
        int size= list.size();
        System.out.println("총 객체수:"+ size);

//        for (Board b : list){
//            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
//            System.out.println();
//        }



    }
}
