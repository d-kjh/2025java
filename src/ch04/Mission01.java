package ch04;

public class Mission01 {
    public static void main(String[] args) {
        //응용력 테스트
        // 5 ~ 10 사이 랜덤 값 나올 수 있도록 해주세요.

        // 0 - (N - 1)
        // 0 > 5이 되어야 하기때문에 + 5처리를 함
        // 최대값 +5를 했을 때 10 이 나와야함
        // 최대값은 5가 되어야함
        // 그래서 m 은 6이 되어야 함
        // int result = (int)(Math.random() * 6 + 5);
        // 1) Math.random() * 6  >>  random()메소드는 double 값을 리턴(0.7 가정)
        // 2) 0.7 * 6  >>  0.7 * 6.0 으로 정수타입 6이 더블타입 6.0으로 자동 형변환
        // 3) 0.7 * 6.0  >>  4.2
        // 4) 4.2 + 5  >>  4.2 + 5.0 으로 정수타입 5가 더블타입 5.0으로 자동 형변환
        // 5) 4.2 + 5.0  >>  9.2
        // 6) (int)9.2  >>  9 으로 9.2 더블타입이 9 정수타입으로 강제 형변환

        // int result = (int)(Math.random() * 6.0) + 5;
        // 1) 0.7 * 6.0  >> 4.2
        // 2) (int)4.2  >> 4 으로 강제 형변환
        // 3) 4 + 5  >>  9
        for (int i = 0; i < 1000; i++) {
            int result = 5 + (int)(Math.random() * 6.0);
            System.out.println(result);
            if (result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;
            }
        }
        System.out.println("--END--");
    }
}
