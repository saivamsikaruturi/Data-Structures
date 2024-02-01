package Strings;

public class PrintPalindromicSubStrings {
    public static void main(String[] args) {
        String s = "ABRBADAADAB";

        for(int i =0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                if(isPalindrome(str)==true && str.length()>1){
                    System.out.println(str);
                }

            }
        }
    }

    static  boolean isPalindrome(String str){
        int i =0;
        int j = str.length()-1;
        while(i<j){
            char ch = str.charAt(i);
            char ch1 = str.charAt(j);
            if(ch!=ch1){
                return false;
            }
            else {
                i++;
                j--;
            }

        }
        return true;
    }
}
