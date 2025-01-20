package java_jungsuk.ch12.practice1;

import java.util.ArrayList;

class Juicer {
    static <T extends Fruit> String makeJuice(FruitBox<T> box) {
        String tmp = "";
        for (Fruit f : box.getList()) tmp += f + " ";
        return tmp;
    }
}
class Fruit {
    public String toString(){return "과일";}
}
class Apple extends Fruit{public String toString(){return "사과";}}
class Grape extends Fruit{public String toString(){return "포도";}}

class Box <T>{
    ArrayList<T> list = new ArrayList<>();
    void setlist(T item){list.add(item);}
    T get(int index){return list.get(index);}
    ArrayList<T> getList(){return list;}
}
class FruitBox <T extends Fruit> extends Box<T>{}





public class JuiceExample {
    public static void main(String[] args) {
                String str=	Juicer.<Apple>makeJuice(new FruitBox<Apple>());
        System.out.println(str.toString());
        	Juicer.<Grape>makeJuice(new FruitBox<Grape>());
       	Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
        	Juicer.makeJuice(new FruitBox<Apple>());
        	Juicer.makeJuice(new FruitBox<Grape>());
    }
}
