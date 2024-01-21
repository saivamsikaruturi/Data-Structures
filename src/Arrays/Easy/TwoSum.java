/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(map.containsKey(num)){
                return new int[] { map.get(num), i };

            }else{
                map.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
