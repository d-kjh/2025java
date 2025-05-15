package ch04.sec03;

import java.sql.SQLOutput;

public class SwitchStudy {
    /*
    switch에서는 관계연사자(<,>,!=,<=,>=) 사용할 수 없다.
    오롯이 == equal만 가능
    switch는 case에 맞는 값이 있으면 진입을하고 break; 키워드를 만날때까지 계속 실행함

    switch ( 변수 ) {
        case 값1:
            처리1;
            break;
        case 값2:
            처리2;
            break;
        [...]

        default:
            나머지 처리;
            break; ( switch 문의 마지막 break는 생략가능)
    }
     */
    public static void main(String[] args){
        int num = 4;

        switch ( num ) {
            case 1:
                System.out.println("1입니다");
            case 2:
            case 3:
                System.out.println("2 or 3입니다");
                break;
            default:
                System.out.println("no 값");
            case 4:
                System.out.println("4입니다");
                break;

        }
        System.out.println("=====end=====");
    }
}
