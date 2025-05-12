package ch03.sec01;

public class IncreaseDecreaseOperatorExample01 {
    public static void main(String[] args) {
        int i1 = 5;
        // 읽기 > 쓰기
        System.out.printf("i1 : %d\n", i1++); // 5
        // 1) System.out.printf("i1 : %d\n", i1)
        // 2) i1 = i1 + 1
        System.out.printf("i1 : %d\n", i1++); // 6
        System.out.printf("i1 : %d\n", i1); // 7

        System.out.println("--------------------");

        int i2 = 5;
        // 쓰기 > 읽기
        System.out.printf("i2 : %d\n", ++i2); // 6
        // 1) i2 = i2 + 1
        // System.out.printf("i2 : %d\n", i2)
        System.out.printf("i2 : %d\n", ++i2); // 7
        System.out.printf("i2 : %d\n", i2); // 7
    }
}
