package thisisjava.ch12.StringclassExample;

public class Test {
    public static void main(String[] args) {


        String str = sb(new String[]{"지승우","지종우","지동산"});
        System.out.println(str);

    }

    //string문자열 배열값을 이어붙여서 반환하기
    public static String sb(String[] str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
}