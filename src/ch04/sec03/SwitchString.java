package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 (W/M) > ");
        String gender = scanner.next();
        System.out.println("gender : " + gender);
        switch ( gender ){
            case "w","W","여","여자":
                System.out.println("여성");
                break;
            case "m","M","남","남자":
                System.out.println("남성");
                break;
            default:
                System.out.println("누구셈");
        }
    }
}
