package Recursion;

public class Factorial {

    public static void main(String[] args) {
        int fact = fact(5);
        System.out.println(fact);
    }

    private static int fact(int i) {
        if(i==0 || i==1){
            return i;
        }

        return i*fact(i-1);
    }
}
