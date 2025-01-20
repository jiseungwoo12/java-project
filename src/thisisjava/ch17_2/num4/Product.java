package thisisjava.ch17_2.num4;

public class Product {
    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    private String name;
    private int no;
    private String company;
    private int price;

    public Product(String name,int no,String company,int price){
        this.name = name;
        this.no = no;
        this.company = company;
        this.price = price;
    }

        public String toString(){
        return new StringBuilder()
                .append("{")
                .append("pno:"+no)
                .append("name:"+name)
                .append("company:"+company)
                .append("price:"+price)
                .append("}")
                .toString();

        }

}
