package Strings;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int startIndex = s.length()-1;
        while(startIndex >= 0){
            while(startIndex >= 0 && s.charAt(startIndex)==' '){
                startIndex--;
            }
            if(startIndex<0){
                break;
            }
            int endIndex = startIndex;
            while(startIndex >= 0 && s.charAt(startIndex)!=' '){
                startIndex--;
            }
            if(sb.length()==0){
                sb.append(s.substring(startIndex+1,endIndex+1));
            }
            else{
                sb.append(" ");
                sb.append(s.substring(startIndex+1,endIndex+1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
