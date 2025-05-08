package ch02.sec01;

public class Mission01 {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;

        System.out.println("num1 : " + num1 + num2); // num1 : 1122

        //1. "num1 : " + num1
        //2. "num1 : " + 11
        //3. "num1 : " + "11"
        //4. "num1 : 11"
        //5. "num1 : 11" + num2
        //6. "num1 : 11" + 22
        //7. "num1 : 11" + "22"
        //8. "num1 : 1122"
        System.out.println( "num : " + (num1 + num2) ); // num : 33
    }
}