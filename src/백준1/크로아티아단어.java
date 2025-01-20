package 백준1;

import java.util.Scanner;

public class 크로아티아단어 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String croatianAlphabets[] = {"dž", "lj", "nj", "č", "ć", "đ", "š", "ž"};

        // 먼저 "dž"와 같은 두 문자로 된 알파벳을 처리
        for (String croatian : croatianAlphabets){
            input = input.replace(croatian, "1");
        }

        // 이제 input 문자열의 길이를 출력하면, 크로아티아 알파벳을 하나의 문자처럼 취급한 길이를 구할 수 있다.
        System.out.println(input.length());
    }
}
