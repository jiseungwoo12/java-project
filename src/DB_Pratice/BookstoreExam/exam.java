package DB_Pratice.BookstoreExam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class exam {
    public static BookStore bookStore = null;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bookStore = new BookStore();

        System.out.println("---------------------------------------");
        System.out.println(" ---------------서점 시스템--------------");
        System.out.println("---------------------------------------");
        while (true) {
            System.out.println("1.책 저장 , 2. 모든 책 출력 , 3. 책 이름으로 검색, 4. 프로그램 종료");
            System.out.println("번호를 입력하세요!");
            int num = sc.nextInt();
            sc.nextLine();
            if (num == 4){
                System.out.println("프로그램 종료합니다.");
                break;
            }

            switch (num) {
                //번호 1
                case 1:
                    int id = 0;
                    String bName = "";
                    String writer = "";
                    int price = 0;
                    //id 입력받기
                    while(true){
                        System.out.println("[id-insert]");
                        try {
                            id = sc.nextInt();
                            if (id <= 0){
                                System.out.println("ID는 1이상 입력해주십시오 ");

                            }else {
                                //버퍼 비우기
                                break;
                            }

                        }catch (InputMismatchException e){
                            System.out.println("잘못된 입력입니다. 숫자 입력하세요");
                            sc.nextLine();
                        }
                    }
                    //책 이름 입력받기
                    while (true){
                        System.out.println("[book-name : insert]");
                        String bname = sc.nextLine();
                        if (bname.trim().isEmpty()){
                            System.out.println("책 이름은 비워둘 수없습니다 . 다시 입력하세요.");
                        }else break;
                    }
                    //저자 이름 입력받기
                    while(true){
                        System.out.println("[book-writer : insert]");
                        String writerinput =sc.nextLine();
                        if (writerinput.trim().isEmpty()){
                            System.out.println("저자 이름은 비워둘수 없습니다 다시입력 바랍니다.");
                        }else break;
                    }
                    //가격 입력받기
                    while (true){
                        System.out.println("[price : insert]");
                        try {
                            int priceinput = sc.nextInt();
                            if (priceinput <= 0){
                                System.out.println("0원 이상의 값을 입력해야합니다. 다시입력하세요.");
                                continue;
                            }else break;
                        }catch (InputMismatchException e){
                            System.out.println("숫자만 입력하세요.");
                            sc.nextLine(); //버퍼 클리어
                        }
                    }
                    //책 추가
                    bookStore.addBook(new Book(id,bName,writer,price));
                    System.out.println("성공적으로 추가 했습니다.");
                    break;


                case 2:
                    System.out.println("[전체 책목록]");
                    bookStore.displayBook();
                    break;

                case 3:
                    System.out.println("검색할 책의 이름을 입력하세요");
                    String searchName = sc.nextLine();
                    List<Book> books = bookStore.findBooksName(searchName);

                    if (books ==  null || books.isEmpty()){
                        System.out.println("검색된 이름의 책은 없습니다.");
                    }else {
                        System.out.println("검색된 책 목록");
                        for (Book b : books){
                            System.out.println(b);
                        }
                    }
                    
                    break;

                default:
                    System.out.println("잘못된 번호를 입력했습니다 다시 입력하세요");
                    break;
            }
        }
    }
}
