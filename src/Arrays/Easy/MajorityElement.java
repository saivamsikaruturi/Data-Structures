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
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int major = 0;
        int count = 0;
        for(int i = 0; i<=nums.length-1;i++){
            if(count==0){
                major = nums[i];
            }

            if(major!= nums[i]){
                count--;
            }

            if(major == nums[i]){
                count++;
            }
        }
        return major;

    }
}
