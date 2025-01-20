package thisisjava.ch15.Quiz.num7;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao boardDao = new BoardDao();

        List<Board> list = boardDao.getBoardList();
        for (Board b : list){
            System.out.println(b.getTitle()+"-"+b.getContent());
        }
    }
}
