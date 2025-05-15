package ch04;

import java.sql.SQLOutput;

public class Mission13 {
    public static void main(String[] args) {
        // int star = ??; 3~8까지 랜덤값

        int star = (int)(Math.random() * 6) + 3;
        System.out.println("star : " + star);
        for (int i=0; i<star; i++) {

            for (int t=0; t<=i; t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
