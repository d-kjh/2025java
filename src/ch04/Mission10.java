package ch04;

public class Mission10 {
    public static void main(String[] args) {
        // int star = ??     3~6사이 랜덤값
        /*
        int star = (int)(Math.random() * 4) + 3;
        System.out.println("star : " + star);
       */

        int star = (int)(Math.random() * 4) + 3;
        System.out.println("star : " + star);
        for(int i=0; i<star; i++){
            for (int t=0; t<star; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
