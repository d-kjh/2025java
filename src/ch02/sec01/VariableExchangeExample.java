package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("x : " + x + ", y : " + y); // x : 3, y : 5


        int a = x;
        x = y;
        y = a;

        System.out.println("x : " + x + ", y : " + y);  // x : 5, y :3
    }
}
