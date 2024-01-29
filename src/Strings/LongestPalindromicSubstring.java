package Strings;

//{ Driver Code Starts
//Initial Template for Java


class LongestPalindromicSubstring {
    static String longestPalindrome(String S){

        String lps = "";

        if(S.length()<=1)
        {
            return S;
        }

        for(int i = 0;i<S.length();i++){


            int low = i;
            int high = i;

            while( low >= 0 && high <S.length() && S.charAt(low) == S.charAt(high)){

                low--;
                high++;


            }
            String s = S.substring(low+1,high);

            if(s.length()>lps.length())
            {
                lps = s;
            }



            low = i-1;
            high = i;
            while(low >= 0 && high <S.length() && S.charAt(low) == S.charAt(high)){

                low--;
                high++;

            }

            s = S.substring(low+1,high);

            if(s.length()>lps.length())
            {
                lps = s;
            }


        }



        return lps;






    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ABRBADAADAB"));
    }
}