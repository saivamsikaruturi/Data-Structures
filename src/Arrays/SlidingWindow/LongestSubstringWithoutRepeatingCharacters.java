package Arrays.SlidingWindow;


public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        int[] arr = new int[256]; // Assuming ASCII characters

        while (j < s.length()) {
            char currentChar = s.charAt(j);
            int index = currentChar - '\0'; // Adjust index for all characters

            arr[index]++;

            while (arr[index] > 1) {
                arr[s.charAt(i) - '\0']--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }
        return maxLength;
    }
}
