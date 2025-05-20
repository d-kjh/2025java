package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------");
        // 똑같이 나오게

        System.out.print("[");
        for (int i=0; i<arr.length; i++){
            if (i != 0){
               System.out.print(", ");
            } System.out.print(arr[i]);
        } System.out.println("]");
    }
}
