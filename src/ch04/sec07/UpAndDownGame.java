package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int answer = // 1~100
        int answer = (int)(Math.random() * 100) + 1;
        System.out.println("answer : " + answer);
        /*
        1~100사이 숫자를 입력해주세요 > 50
        Down!
        1~100사이 숫자를 입력해주세요 > 25
        Up!

        맞출때까지 반복한다
        정답!
         */
        System.out.println("1 ~ 100사이 숫자를 입력해주세요");
        int num = 0;
        while ( true ) {
            System.out.print(">> ");
            num = scanner.nextInt();
            if ( num == answer) {
             System.out.println("정답");
             break; // break를 감싸고 있는 가장 가까운 반복문을 빠져나온다
            } else if ( num > answer) {
             System.out.println("Down");
            } else {
              System.out.println("Up");
            }
        }
    }
}
