package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            // int num = ?? 1~6사이 랜덤값

            int num = (int)(Math.random() * 6) + 1;
            System.out.printf("num : " + num );
            if (num == 6){
                break;
            }
        }
    }
}
