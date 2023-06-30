package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shreejan Acharya on 6/29/2023
 * @project coding_interview
 */
public class Is_String_Permutation {

    /*
     * THIS METHOD CHECK IF THE TWO STRING ARE PERMUTATION OF EACH OTHER OR NOT
     * IF THE STRING ARE PERMUTATION THE THEN IT CONSIDER SAME NUMBER OF STRING
     * */
    public static boolean isPermutationString(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();


        for (int i = 0; i < str1.length(); i++) {
            if (str1Map.containsKey(str1.charAt(i))) str1Map.put(str1.charAt(i), str1Map.get(str1.charAt(i)) + 1);
            else str1Map.put(str1.charAt(i), 1);

            if (str2Map.containsKey(str2.charAt(i))) str2Map.put(str2.charAt(i), str2Map.get(str2.charAt(i)) + 1);
            else str2Map.put(str2.charAt(i), 1);
        }

        for (char k :str1Map.keySet()) {
            if (!str1Map.get(k).equals(str2Map.get(k))) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationString("RAT", "ABC"));
        System.out.println(isPermutationString("ABC", "ABC"));
    }
}
