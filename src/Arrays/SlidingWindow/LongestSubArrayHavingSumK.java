package Arrays.SlidingWindow;

public class LongestSubArrayHavingSumK {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int i = 0, j = 0, currentSum = 0;
        int longestWindow = Integer.MIN_VALUE;
        while (j < N) {
            currentSum += A[j];
            if (currentSum == K) {
                longestWindow = Math.max(longestWindow, j - i + 1);
            } else {
                while (currentSum > K) {
                    currentSum -= A[i];
                    i++;
                    if (currentSum == K) {
                        longestWindow = Math.max(longestWindow, j - i + 1);
                    }
                }
                j++;
            }
        }
        return longestWindow;
    }
}