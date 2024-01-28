package Arrays.TwoPointers;

public class MissingNumber {
    public static void main(String[] args) {

       int[] a = {1, 2, 3, 5};
        int result = 0;

        // XOR all elements in the array
        for (int num : a) {
            result ^= num;
        }

        // XOR numbers from 1 to n
        for (int k = 1; k <= a.length + 1; k++) {
            result ^= k;
        }

        System.out.println( result);
    }
}
