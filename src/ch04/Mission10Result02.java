package ch04;

public class Mission10Result02 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4) + 3;
        System.out.println("star : " + star);
        int totalCount = star * star;
        for(int i=1; i<=totalCount; i++){
            System.out.print("*");
            if( i % star == 0) {
                System.out.println();
            }
        }
    }
}
