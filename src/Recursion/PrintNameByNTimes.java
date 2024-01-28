package Recursion;

public class PrintNameByNTimes {
    public static void main(String[] args) {
        printName(1,3);
    }

    private static void printName(int i, int n) {
        if(i>n){
            return;
        }

        System.out.println("vamsi");
        printName(i+1,n);
    }
}
