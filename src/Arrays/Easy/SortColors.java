package Arrays.Easy;


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
