package Arrays.Easy;

import java.util.*;
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        long sum; // Change the datatype to long
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    sum = (long)nums[i] + nums[j] + nums[left] + nums[right]; // Cast to long

                    if (sum > target) {
                        right -= 1;
                    } else if (sum < target) {
                        left += 1;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);

                        // Move both pointers towards the center.
                        left += 1;
                        right -= 1;

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
