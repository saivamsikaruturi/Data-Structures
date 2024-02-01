package Strings;

import java.util.HashMap;
import java.util.Map;


public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    // Isomorphic : If all occurrences of a character can be replaced with other character to form the second string.
    /*
     s = "egg"
     t = "add"
     replace e with a
     s = agg
     replace g with d
     a = add , so s and t are equal so isomorphic.


     s = "foo"
     t = "bar"
     replace f with b
     s = boo
     replace o with a
     s= baa , so s and t are not equal, so not isomorphic.
     */
    public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;
        Map<Character,Character> map=new HashMap<>();

        if(s.length()<= 1 || s==null) return true;
        for (int i = 0 ; i< s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (!map.get(a).equals(b)) {
                    return false;
                }
            } else {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
