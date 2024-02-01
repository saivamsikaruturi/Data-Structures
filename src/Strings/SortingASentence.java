package Strings;

import java.util.HashMap;
import java.util.Map;

public class SortingASentence {
    public String sortSentence(String s) {
        String[] sentence = s.split("\\s");
        Map<Integer,String> map = new HashMap<>();
        for(String word : sentence){

            int number =  word.charAt(word.length()-1);
            String actualWord = word.substring(0,word.length()-1);
            map.put(number,actualWord);
        }

        StringBuilder builder = new StringBuilder();
        for(String words : map.values()){

            builder.append(words);
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
