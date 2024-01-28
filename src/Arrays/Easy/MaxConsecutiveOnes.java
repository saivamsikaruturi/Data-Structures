package Arrays.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=Integer.MIN_VALUE;
        int i =0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            i++;
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;

    }
}
