package Strings;

public class RepeatedString {

    public static void main(String[] args) {
        // 'abab'

        String s ="abab";
        int n =14;
        int count=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }

        int repeatedTimes = n/s.length(); // 14/4 = 3
        int left = n - (s.length()*repeatedTimes); //14-(4*3) = 2
        int extra=0;
        for(int i =0;i<left;i++){
            if(s.charAt(i)=='a'){
                extra++;
            }
        }

        System.out.println((repeatedTimes*count)+extra); //(3*2)+1

    }


}
