package thisisjava.ch15.ArrayListExam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List <Board> list = new ArrayList<>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        int size = list.size();
        System.out.println("총 리스트 수 : "+ size);
        System.out.println();

        //특정 인덱스의 객체 가져오기
        //인덱스 2의 객체가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Board board1 = list.get(i);
            System.out.println(board1.getSubject()+"\t"+board1.getContent()+"\t"+board1.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

//        for (int i = 0; i < list.size(); i++) {
//            Board board1 = list.get(i);
//            System.out.println(board1.getSubject()+"\t"+board1.getContent()+"\t"+board1.getWriter());
//        }
//        System.out.println();
        for (Board board1 : list){
            System.out.println(board1.getSubject()+"\t"+board1.getContent()+"\t"+board1.getWriter());
        }









    }
}
