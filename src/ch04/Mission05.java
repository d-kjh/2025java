package ch04;

public class Mission05 {
    public static void main(String[] args) {
        // int starCount = ?? // 1) 2~7사이 랜덤값
        /*
        int starCount = (int)(Math.random() * 6) + 2;
        System.out.printf("starCount : %d\n", starCount);
        */
        // starCount = 3;
        // ***

        int starCount = (int)(Math.random() * 6) + 2;
        System.out.printf("starCount : %d\n", starCount);
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
    }
}
