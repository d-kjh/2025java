package ch04;

import java.util.Scanner;

public class Mission04 {
    public static void main(String[] args) {
        // int score = ?? // 0 ~ 200 사이의 랜덤값

        // 만약 score값이 100 ~ 90점 사이면 A학점
        // 만약 score값이 80 ~ 89점 사이면 B학점
        // 만약 score값이 70 ~ 79점 사이면 C학점
        // 만약 score값이 70점 미만이면 D학점
        // 만약 score값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 : ");
        int score = scan.nextInt();
        System.out.printf("score : %d\n", score);
        if (100 < score || score < 0) { // 0미만 혹은 100초과인 경우
            System.out.println("측정불가");
            // 0 ~ 100 사이 값이면 아래로 지나감
        } else if (score >= 90) { // 100 ~ 90 사이
            System.out.println("A학점");
            // 0 ~ 89 사이 값이면 아래로 지나감
        } else if (score >= 80) { 
            System.out.println("B학점");
            // 0 ~ 79 사이 값이면 아래로 지나감
        } else if (score >= 70) {
            // 0 ~ 69 사이 값이면 아래로 지나감
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        } System.out.println("-----END-----");
    }
}
