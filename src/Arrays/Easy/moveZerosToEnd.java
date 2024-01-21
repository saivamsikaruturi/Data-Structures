/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Arrays.Easy;

import java.util.Arrays;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class moveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<= nums.length-1){

            if(nums[i]!=0){

                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else
                i++;

        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
