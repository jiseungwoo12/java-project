package thisisjava.ch18.Question.num1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception{

        String filePath = "C:/Temp/ReadCopyExample.java";

        FileReader fr =new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rownumber = 0;
        String rowdata;
        while (true){
            rownumber++;
            rowdata = br.readLine();
            //한 행씩 읽어주는 readLine()메서드
            if (rowdata == null)break;
            System.out.println(rownumber+": "+rowdata);

        }




       }
}
