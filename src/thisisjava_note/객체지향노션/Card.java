package thisisjava_note.객체지향노션;

public class Card {

    int number;
    String color;
    String pattern;

    public Card(int number,String color,String pattern){ //셋다
        this.number = number;
        this.color = color;
        this.pattern = pattern;

    }
    public Card(int number,String color){  //무늬는 바꾸지 않고 숫자와 색상만 변경하기
        this.number = number;
        this.color = color;
    }
    public Card(String color,String pattern){  //숫자는 바꾸지않고 색상과 무늬만 변경하기
        this.color = color;
        this.pattern = pattern;
    }
















    

}
