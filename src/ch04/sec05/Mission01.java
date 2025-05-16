package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        합계를 구할 숫자를 입력하세요. (종료:0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
        >> 합계 : 1000
         */
        boolean num = true;
        int num2 = 0;
        int num3 = 0;
        System.out.println("합계를 구할 숫자를 입력(종료 : 0)");
        while ( num ) {
            System.out.print(">> ");
            num3 = scanner.nextInt();
            num2 += num3;

            System.out.printf("합계는 %,d", num2);
            if (num3 == 0) {
                num = false;
                System.out.printf("합계는 %d", num2);
            }
        }
    }
}