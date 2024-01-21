package Arrays.Easy;

import java.util.Arrays;


public class moveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<= nums.length-1){

            if(nums[i]!=0){

                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else
                i++;

        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 0, 1};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
