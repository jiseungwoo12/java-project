package thisisjava.ch18.num8.ObjectInoutputStream;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Member m1 = new Member("wltmddn","지승우");
            Product p1 = new Product("과자",1500);
            int arr1[] = {1,2,3};

            oos.writeObject(m1);
            oos.writeObject(p1);
            oos.writeObject(arr1);

            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Member m2 = (Member)ois.readObject();
            Product p2 = (Product)ois.readObject();
            int arr2[] = (int[])ois.readObject();

            fis.close(); ois.close(); //ois만 종료해도 fis(메인스트림)도 꺼진다.
            System.out.println(m2);
            System.out.println(p2);
            System.out.println(Arrays.toString(arr2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
