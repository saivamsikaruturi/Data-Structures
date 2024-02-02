package Matrices;


public class RotateImage {
    public void rotate(int[][] matrix) {

        //Step -1  =>
        for(int i =0;i< matrix.length;i++){
            int left = 0,right = matrix[0].length-1;
            while(left<right){
                int temp = matrix[left][right];
                matrix[left][right]=matrix[right][left];
                matrix[right][left]=temp;
                left++;
                right--;
            }
        }
        //Step - 2 => Reversal of columns
        reverseEachElementOfARow(matrix);

    }

    public static void reverseEachElementOfARow(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            int left = 0;
            int right = arr[0].length-1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
