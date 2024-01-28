package Arrays.prefixSum;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int start = 0;

        if (nums.length == 1 && k == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > k) {
                sum -= nums[start];
                start++;
            }
            if (sum == k) {
                count++;
            }
        }

        return count;

    }
}