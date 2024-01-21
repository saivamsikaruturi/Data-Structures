/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Matrices;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {

        //Step -1  =>
        for (int i=0; i<matrix.length; i++) {
            for (int j=i; j<matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
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
