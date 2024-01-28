package Matrices;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int direction = 0;
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.println(matrix[top][i]);
                }
                top++;
            }

            if (direction == 1) {

                for (int i = top; i <= bottom; i++) {
                    System.out.println(matrix[i][right]);
                }
                right--;
            }

            if (direction == 2) {

                for (int i = right; i >= left; i--) {
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }

            if (direction == 3) {

                for (int i = bottom; i >= top; i--) {
                    System.out.println(matrix[i][left]);
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }

    }
}
