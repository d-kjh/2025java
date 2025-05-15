package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (W/M) > ");
        String gender = scanner.next();
        System.out.println("gender : " + gender);
        if ("w".equalsIgnoreCase(gender) || "여".equals(gender)|| "여자".equals(gender)) {
            System.out.println("넌 여자");
        } else if ("m".equalsIgnoreCase(gender)|| "남".equals(gender)|| "남자".equals(gender)){
            System.out.println("넌 남자");
        } else {
            System.out.println("다시 입력");
        }
    }
}
