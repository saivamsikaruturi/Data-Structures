package Strings;

public class StringToInteger {
    public int myAtoi(String s) {

        if(s.length()==0) return 0;
        int i =0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        s= s.substring(i);
        long ans=0;
        int sign =+1;
        if(s.length() > 0 && s.charAt(0) == '-') sign =-1;
        int MIN = Integer.MIN_VALUE;
        int MAX=  Integer.MAX_VALUE;
        i = ( s.length() > 0 && (s.charAt(0)=='+' || s.charAt(0)=='-')) ? 1 : 0;

        while(i<s.length()){
            if(s.charAt(0)==' ' || ! Character.isDigit(s.charAt(i)))
                break;
            ans = ans*10+s.charAt(i)-'0';
            if(sign ==-1 && -1*ans<MIN) return MIN;
            if(sign == 1 && ans>MAX) return MAX;
            i++;
        }

        return (int)(sign*ans);
    }
}
