package ch05.sec06;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        int max = arr[0];

        // arr 배열에서 가장 큰 값 찾기
        for (int i=1;i<arr.length;i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("MAX 값 : %d", max);
    }
}
