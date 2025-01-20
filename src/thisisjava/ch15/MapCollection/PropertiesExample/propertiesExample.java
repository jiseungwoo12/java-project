package thisisjava.ch15.MapCollection.PropertiesExample;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Properties;

public class propertiesExample {
    public static void main(String[] args)  {
        //properties객체생성
        //properties는 키와값을 string타입로 제한한 컬렉션이다.
        //다른 맵의 컬렉션은 Map인터페이스에 객체를 생성하지만.
        //properties는 properties만의 필드나 메서드를 사용해야하므로
        //밑과 같은 propertise타입으로 객체를 생성한다
        //다시보기 부모의클래스나 인터페이스로 객체를 생성할시
        //부모의클래스나 인터페이스에 내장되어있는 값(메서드,필드)만 사용할수있기때문에
        //이렇게 만드는것이다.
        Properties properties = new Properties();
        //Properties의 load메서드는 예외를 던진다.
        //throws IOException try-catch문으로 예외를 처리해주면됨
        try {       //load 경로를받아 값들을 읽어온다.

            properties.load(propertiesExample.class.getResourceAsStream("database.properties"));
                    //클래스이름.class는 클래스의 정보를 읽기위한 리플랙션코드이다.
            //getResourceAsStream은 getResource와 다르게 경로의 값만 가져오는게 아니라 그안에있는내용을
            //읽어오고 싶을때 사용한다.
            // getResourceAsStream을하면 InputStream객체에 저장되었다가 properties객체로 받아오는것이다.
        }catch (IOException e){e.printStackTrace();}
        //string타입으로 제한되었기때문에 값을 얻어올때도 string타입으로 얻어온다.
        //값을 얻어올때는 properties.getProperty(String key) key값을 입력해 value값을 가져오는것은 map과유사.
        String driver =properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");
        System.out.println("driver:" +driver);
        System.out.println(admin);

    }
}
