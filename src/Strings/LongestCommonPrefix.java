package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"club","clap","clove"};
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<first.length;i++){
            if(first[i]==last[i]){
                sb.append(first[i]);
            }
            else{
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
