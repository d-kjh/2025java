package ch04;

public class Mission09 {
    public static void main(String[] args) {
        // int dan = ??;  2~9사이 랜덤값 생성
        /*

        int dan = (int)(Math.random() * 8) + 2;
        System.out.println("dan : " + dan);

        dan : 2
        2 * 1 = 2
        2 * 2 = 4
        */

        int dan = (int)(Math.random() * 8) + 2;
        System.out.println("dan : " + dan);
        for (int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }
    }
}
