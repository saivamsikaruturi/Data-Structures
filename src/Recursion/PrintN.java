package Recursion;

public class PrintN {
    public static void main(String[] args) {
        printNumbers(10);
    }

    private static void printNumbers(int n) {
        if(n == 0){
           return ;
        }

        System.out.print(n +" ");
       printNumbers(n-1);
    }
}
