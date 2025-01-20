package 백준1;

import DesignPatternStart.num1.DesignPuzzle.Character;

import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        //알파벳 대소문자로 된 단어가 주어지면,
        // 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        // 단, 대문자와 소문자를 구분하지 않는다.
        Scanner sc = new Scanner(System.in);
        //단어를입력받기
        String words = sc.next();
        //소문자로된 알파벳의 총개수는 26가지 이들의값을 개수별로담아야하니깐
        int wordNumber[] = new int[26];

        //문자열을 문자배열로 하나씩 나누어서 담는다(소문자로 변환하여)
        char carr[] = words.toLowerCase().toCharArray();
        for (int i = 0; i < carr.length; i++) {
             //carr의 배열에있는 모든항목을 알파벳인지로 검사한다.
                //알파벳일시 (carr[i])'a''b''c''d' [0] = 'a' a-a = 0
                wordNumber[carr[i]-'a']++; //a일시 0인덱스에는 a값이들어가고 ++로 같은 a의수만큼증가
                //[1]에는 'b'문자갯수가 ++로 증가

        }
        //가장 많이 사용된 알파벳을 찾기위해
        int maxCount = 0;
        char mostFrequant = '?';
        for (int i = 0; i < wordNumber.length; i++) { //알파벳의개수만큼 반복
                if (maxCount < wordNumber[i]){
                    maxCount = wordNumber[i];
                            //i+'a'는 0+a 'a' 1+'a'= b 이런식으로 합산된다.
                    mostFrequant = (char) (i + 'a');
                } else if (wordNumber[i] == maxCount) {
                    mostFrequant = '?';
                }
        }
        System.out.println(mostFrequant);














    }
}
