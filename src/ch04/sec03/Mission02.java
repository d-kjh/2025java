package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        // int score = ??; 0 ~ 100 랜덤 값

        int score = (int)(Math.random() * 101);
        System.out.println("score : " + score);

        switch ( score / 10 ) {
            case 9,10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");

        }
    }
}
