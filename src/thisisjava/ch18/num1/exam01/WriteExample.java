package thisisjava.ch18.num1.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args)  {

//        OutputStream os = null;
//        try {
//            os = new FileOutputStream("C:/Temp/test1.db");
//            byte a = 10;
//            os.write(a);
//            os.flush();
//            System.out.println("저장 성공");
////            os.close();
//            //try문에서 close를 해도되지만
//        }catch (Exception e){
//            e.printStackTrace();
//        }//안전하게 닫기위해서 catch문이 끝난 뒤
//        finally {
//            try {
//                os.close();
//            }
//           catch (Exception e){}
//
//        }
        //입출력 스트림은 AutocloseAble을 구현하고있기때문에
        //앞서 학습했던 try-with-resource문을 사용하여 자동으로 닫아주는 코드를 짤수있다
        try (OutputStream os = new FileOutputStream("C:/Temp/test1.db",true)){
            //append는 boolean타입이고 true가 되면 기존에잇던파일말고 새롭게추가하겠다
            //false가 되면 기존에있던 값을 덮어쓰겟다라는 의미이다.
            byte a = 10;
            byte b = 20;
            byte c = 30;
            os.write(a); //데이터를 버퍼에 저장
            os.write(b);
            os.write(c);
            os.flush(); //바이트로 저장된 버터의 데이터를 모두 출력 output
            System.out.println("저장 성공");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
