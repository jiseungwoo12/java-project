package thisisjava_note.ch02;

public class 주사위 {
    public static void main(String[] args) {

        int dicenum = (int)(Math.random()*6)+1;

        switch(dicenum) {
            case 1:
                System.out.println("1번입니다.");
                break;
            case 2:
                System.out.println("2번입니다.");
                break;
            case 3:
                System.out.println("3번입니다.");
                break;
                case 4:
                System.out.println("4번입니다.");
                break;case 5:
                System.out.println("5번입니다.");
                break;case 6:
                System.out.println("6번입니다.");
                break;
        }
    }
}
