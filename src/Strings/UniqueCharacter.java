package Strings;

public class UniqueCharacter {

    static String S = "fourByFourFrog";

    public static void main(String[] args) {
        System.out.println(unique());
        System.out.println(nonrepeatingCharacter("zxvczbtxyzvy"));
    }

    private static int unique() {
        int[] array = new int[256];
        String s = S.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            array[currentChar - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (array[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }


    static char nonrepeatingCharacter(String S) {

        int[] freq = new int[26];
        for (int i = 0; i < S.length(); i++) {

            freq[S.charAt(i) - 'a']++;

        }

        char ch = '$';

        for (int i = 0; i < S.length(); i++) {
            if (freq[S.charAt(i) - 'a'] == 1) {
                ch = S.charAt(i);
                break;

            }
        }

        return ch;
    }


}
