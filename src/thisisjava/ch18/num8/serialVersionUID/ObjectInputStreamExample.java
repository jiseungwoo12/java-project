package thisisjava.ch18.num8.serialVersionUID;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("C:/Temp/data.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member member = (Member)ois.readObject();
        Product product = (Product)ois.readObject();
        int arr[] = (int[])ois.readObject();

        System.out.println(member);
        System.out.println(product);
        System.out.println(Arrays.toString(arr));
    }
}
