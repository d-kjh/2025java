package ch05.sec06;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][][] arr = {
                {
                        {10, 20, 30},
                        {40, 50, 60},
                },
                {
                        {70, 80, 90},
                        {100, 110, 120},
                }
        };

//        System.out.println("-------------------");
//
//        for (int i=0; i<arr.length; i++){
//            for (int k=0; k<arr[i].length; k++){
//                System.out.println(arr[i][k]);
//            }
//        }
        System.out.println("-------------------");

        for (int[][] row : arr) {
            for (int[] row1 : row) {
                for (int element : row1) {
                    System.out.println(element);
                }
            }
        }
    }
}