package DB_Pratice.BookstoreExam;

public class Book {
    private int id;
    private String title;
    private String writer;
    private int price;
    private int quantity;

    //책 수량을 수정하기
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    //값을 입력받을 생성자
    public Book(int id,String title,String writer,int price){
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.quantity = 1;

    }


    //게터 세터
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return  "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + writer + '\'' +
                ", price=" + price +
                ", 수량=" + quantity +
                '}';
    }

    
    
    

}
