package thisisjava.ch15.ComparableExam.ComparatorExam;

import java.util.TreeSet;

public class FruitExam {
    public static void main(String[] args) {

        //comparable인터페이스 구현없이 fruit객체를 treeset에 추가하는방법
        //treeSet의 생성자칸에 n
        TreeSet<Fruit> fruit =  new TreeSet<>(new FruitComparator());

        fruit.add(new Fruit("사과",1000));
        fruit.add(new Fruit("배",2000));
        fruit.add(new Fruit("포도",500));
        for (Fruit f : fruit){
            System.out.println(f.name+":"+f.price);
        }


    }

}
