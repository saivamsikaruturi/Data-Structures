/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Arrays.Easy;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class CheckIfArrayIsSorted {
    public static boolean check(int[] nums) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[(i+1)%nums.length]< nums[i]){
                count++;
            }
            if(count>1)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{3,4,5,1,2}));
    }
}
