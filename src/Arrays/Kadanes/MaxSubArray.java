/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Arrays.Kadanes;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int sum = nums[0];
        for(int i =1;i<nums.length;i++){
            if(sum > 0){
                sum+=nums[i];
            }
            else{
                sum = nums[i];
            }
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;


    }
}
