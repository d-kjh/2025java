package ch03.sec07;

// p.94
public class LjogicalOperatorExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;

        System.out.printf(" %d > %d : %b\n ", num1, num2, num1 > num2);
        System.out.printf(" 5 > 0 && 5 > 2 : %b\n ", 5 > 0 && 5 > 2);
        System.out.printf(" 5 > 0 && 5 < 2 : %b\n ", 5 > 0 && 5 < 2);
        System.out.printf(" 5 > 0 && 5 > 2  && 10 < 2 : %b\n "
                , 5 > 0 && 5 > 2 && 10 < 2);
        // 1) 5 > 0     >> true
        // 2) 5 < 2     >> false
        // 3) true && false     >> and연산자 false  false가 뜨면 뒤에 연산은 하지않음
        System.out.println();
        System.out.printf(" 5 > 0 || 5 < 2 : %b\n", 5 > 0 || 5 < 2);
        // 1) 5 > 0     >> true     >> or연산자 true가 뜨는 순간 뒤에는 연산하지 않음
        System.out.printf(" 5 < 0 || 5 < 2 : %b\n", 5 < 0 || 5 < 2);
        System.out.println();
        System.out.printf("!(5 < 0 || 5 < 2) : %b\n", !(5 < 0 || 5 < 2));
        System.out.printf("!false : %b\n", !false);
    }
}
