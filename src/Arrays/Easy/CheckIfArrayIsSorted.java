package Arrays.Easy;


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
