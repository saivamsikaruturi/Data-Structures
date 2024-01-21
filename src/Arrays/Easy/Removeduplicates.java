package Arrays.Easy;


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
