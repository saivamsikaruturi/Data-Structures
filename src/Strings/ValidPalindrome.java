package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "listen";
        System.out.println(validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)== s.charAt(right)) {
                left++;
                right--;
            }
                else {
                return false;
            }
        }
        return true;
    }
}
