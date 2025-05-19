package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /* 반복
        ------------------------
        1.예금 | 2.출금 | 3.잔고 | 4.종료
        ------------------------
        선택 >
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int num3 = 0;

        while ( true ) {
            System.out.println("---------------------------------\n" +
                    "1.예금 | 2.출금 | 3.잔고 | 4.종료\n" +
                    "---------------------------------");
            System.out.printf("현재 잔액 : %,d원\n", num3);
            System.out.print("선택 > ");
            num = scanner.nextInt();
            if ( num == 4 ){
               System.out.println("종료");
               break;
            } else if ( num == 1) {
                System.out.println("예금액 > ");
                num2 = scanner.nextInt();
                num3 += num2;
            } else if ( num == 2 ) {
                System.out.println("출금액 > ");
                num2 = scanner.nextInt();
                if ( num3 >= num2 ){
                num3 -= num2;
                } else {
                    System.out.println("돈 없다");
                }
            } else if ( num == 3 ) {
                System.out.printf("현재 잔액 > %,d원\n", num3);
            } else {
                System.out.println("숫자 입력 다시하셈");
            }
        }
    }
}
