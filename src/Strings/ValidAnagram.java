package Strings;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(valid());

    }

    private static boolean valid() {
        String s = "aabaa";
        String t = "baaaaa";


        int[] array = new int[26];
        for(int i =0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }

        for(int i =0;i<t.length();i++){
            array[t.charAt(i)-'a']--;
        }

        for(int i =0;i<array.length;i++){
            if(array[i]>0 || array[i]<0){
                return false;
            }
        }

        return true;
    }
}
