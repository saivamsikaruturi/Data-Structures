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
public class Removeduplicates {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for( int i =1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5};
        int duplicates = removeDuplicates(array);
         for(int i =0;i<duplicates;i++){
             System.out.println(array[i]);
         }
    }
}
