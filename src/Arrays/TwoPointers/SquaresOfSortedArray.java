package Arrays.TwoPointers;

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }

        int[] result = new int[nums.length];


        int left = 0;
        int right = nums.length-1;
        for(int i = result.length-1;i>=0;i--){
            if(nums[left] > nums[right]){
                result[i] = nums[left];
                left++;
            }
            else{
                result[i] = nums[right];
                right--;
            }
        }

        return result;

    }
}