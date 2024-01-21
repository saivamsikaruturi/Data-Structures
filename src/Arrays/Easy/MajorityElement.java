package Arrays.Easy;


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
