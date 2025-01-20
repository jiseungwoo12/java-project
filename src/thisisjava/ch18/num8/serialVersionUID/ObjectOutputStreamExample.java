package thisisjava.ch18.num8.serialVersionUID;

import thisisjava.ch13.제네릭Test.test7.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("C:/Temp/data.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Member("wltmddn","지승우"));
        oos.writeObject(new Product("지승우",20000));
        oos.writeObject(new int[]{1,2,3});

        oos.flush();oos.close();


    }
}
