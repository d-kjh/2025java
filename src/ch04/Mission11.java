package ch04;

public class Mission11 {
    public static void main(String[] args) {
        // 2~9단 구구단 출력 단수가 바뀔 때 개행처리

        int dan = (int)(Math.random() * 8) + 2;
        System.out.println("dan : " + dan);

        for (int i=2; i<10; i++) {

            for (int t=1; t<10; t++){
                System.out.printf("%d X %d = %d\n", i, t, i * t);
            }
            System.out.println();
        }
    }
}
