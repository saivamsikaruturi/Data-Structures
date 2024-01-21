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
public class SortColors {
    public void sortColors(int[] nums) {
        int i =0;
        int low = 0;
        int high = nums.length-1;
        while(i<=high){
            if(nums[i]==1){
                i++;
            }
            else if(nums[i]==0){
                swap(nums,i,low);
                i++;
                low++;
            }
            else{
                swap(nums,i,high);
                high--;
            }
        }
    }

    public void swap(int[] nums,int low,int high){
        int a = nums[low];
        nums[low]=nums[high];
        nums[high]=a;
    }
}
