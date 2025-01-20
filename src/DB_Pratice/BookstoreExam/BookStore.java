package DB_Pratice.BookstoreExam;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books = new ArrayList<>();  //책을 저장할 ArrayList

    public void addBook(Book book){  //책 저장메서드
        for (Book b : books){  //책의 이름과 저자가 같을시엔 같은 책이므로 책수량을 +1
            if (b.getTitle().equalsIgnoreCase(book.getTitle()) && b.getWriter().equalsIgnoreCase(book.getWriter())) {
                b.setQuantity(b.getQuantity() + 1);
                return;
            }
        }  //새로운 책이라면 그냥 add
        books.add(book);
    }
    public void displayBook(){ //모든 책의 내용을 출력
        for (Book book : books){
            System.out.println(book);
        }
    }
    public List<Book> findBooksName (String name) {  //책의 제목으로 검색하는 기능
        if (name.length() < 2){   //한글자만 입력할시 검색 x 리턴값 null
            System.out.println("두 글자 이상 입력해 주세요");
            return null;
        }

        List<Book> findBooks = new ArrayList<>();


        for (Book book : books) {
            //대소문자 구분없이 입력한값을 반환 
            //book.getTiltle()을 소문자로 변환하고 .contains로 입력한 name의 소문자값을 비교함
            if (book.getTitle().toLowerCase().contains(name.toLowerCase())) {  //입력한값
                findBooks.add(book);   //책의 값을 반환해줌
            }
        }
        if (findBooks.isEmpty()){  //검색한 책 목록이 비어있을시
            System.out.println("이런 책은 없습니다."); //없을시엔 책이없다고 문구가뜨며
        }
        return findBooks;  //
    }


}
