package Arrays.Kadanes;


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
