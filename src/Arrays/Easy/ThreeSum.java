package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(triplet);

                    // Move j and k to the next distinct elements
                    while (j < k && nums[j] == triplet.get(1)) {
                        j++;
                    }
                    while (j < k && nums[k] == triplet.get(2)) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

            // Skip duplicates of the first element
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }

        return result;
    }
}
