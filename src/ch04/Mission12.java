package ch04;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2 \t 3 x 1 = 3 \t 4 x 1 = 4\t .....9 x 1 = 9\n
        .
        .
        .
        2 x 9 = 18\t 3 x 9 = 27\t 4 x 9 = 36\t .....9 x 9 = 81\n
         */

        for (int i=1; i<10; i++){
            for (int n=2; n<10; n++){
                System.out.printf("%d X %d = %d\t", n, i, n * i);
            }
            System.out.println();
        }
    }
}
