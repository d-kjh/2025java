package ch04;

public class Mission14 {
    public static void main(String[] args) {
        // int star = ??; 4~9 랜덤값
        int star = (int)(Math.random() * 6) + 4;
        System.out.println("star : " + star);
        
        // for문 3개
        for (int i=1; i<=star; i++) {
            int underCnt = star - i;
            for (int t = 0; t < underCnt; t++) {
                System.out.print("_");
            }
            for (int n = 0; n < i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        for (int i=star; i>0; i--) {

            int k=1;
            for ( ; k<i; k++) {
                System.out.print("_");
            }
            for ( ; k<=star; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        
        for (int i=star; i>0; i--) {

            for (int k=1; k<=star; k++) {
                System.out.print(k < i ? "_" : "*");
            }
            System.out.println();
        }

        System.out.println("---------------------------");

        int totalStar = star * star;
        int line = 1;
        int printedChar = 0;

        for (int i = 1; i <= totalStar; i++) {
            if (printedChar < star - line) {
                System.out.print(" ");
            } else if (printedChar < star) {
                System.out.print("*");
            }

            printedChar++;

            if (printedChar == star) {
                System.out.println();
                line++;
                printedChar = 0;

                if (line > star) break;
            }
        }
        System.out.println("------------");
    }
}
