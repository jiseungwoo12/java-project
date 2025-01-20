package thisisjava.ch15.ComparableExam.ComparatorExam;

public class Fruit {
    //이번에는 comparable을 구현하지않고 비교자를 사용하여 treeSet객체에 이 클래스객체를 저장해보자
    public String name;
    public int price;

    public Fruit(String name,int price){
        this.name= name;
        this.price = price;
    }
}
