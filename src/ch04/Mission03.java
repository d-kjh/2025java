package ch04;

public class Mission03 {
    public static void main(String[] args) {
        //1~100 사이의 랜덤값 나오게 해주고

        // 랜덤값이 vaule = 97;라면
        // 출력 : 97는(은) 홀수입니다.

        // 랜덤값이 value = 54;라면
        // 출력 : 54는(은) 짝수입니다.

        int value = (int)(Math.random() * 100) + 1;
        if (value % 2 == 0) {
            System.out.println(value + "는(은) 짝수입니다.");
        } else {
            System.out.println(value + "는(은) 홀수입니다.");
        }

        String oddEven = "홀";
        if (value % 2 == 0) {
            oddEven = "짝";
        }
        System.out.printf("%d는(은) %s수입니다.\n", value, oddEven);

        System.out.printf("%d는(은) %s수입니다.\n",
                value, value % 2 == 0 ? "짝" : "홀"); // 삼항식
    }
}
