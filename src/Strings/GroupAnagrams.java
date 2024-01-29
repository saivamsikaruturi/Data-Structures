package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s = {"rat","eat","eat","tea","listen","silent"};
        Map<String, List<String>> map = new HashMap<>();
        for(int i =0;i<s.length;i++){

            String str = getFrequencyString(s[i]);

            if(map.containsKey(str)){
                map.get(str).add(s[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s[i]);
                map.put(str,list);
            }

        }
        List<List<String>> lists = new ArrayList<>();

        for (List<String> strList : map.values()) {
            List<String> val = new ArrayList<>(strList);  // Copy the elements from strList to val
            lists.add(val);  // Add the new list to the result lists
        }
        System.out.println(lists);
    }

    private static String getFrequencyString(String s) {


        int[] freq = new int[26];

        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        char c ='a';
        for(int i =0;i< freq.length;i++){
                sb.append(c);
                sb.append(freq[c-'a']);
              c++;

        }

        return sb.toString();
        }


    }

