package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shreejan Acharya on 6/29/2023
 * @project coding_interview
 */
public class PalindromePermutation {
    /*
     * CHECK IF THE SENTENCE OR WORD IS PALINDROME OR NOT
     * */
    private static boolean isPalindrome(String str) {
        if (str == null) return false;
        str=str.replace(" ","");
        int lower = 0;
        int higher = str.length() - 1;
        while (lower < higher) {
            if (str.charAt(lower) != str.charAt(higher)) return false;
            lower++;
            higher--;
        }
        return true;
    }

    private static boolean checkIfContainsSameCharacters(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (str1Map.containsKey(str1.charAt(i))) str1Map.put(str1.charAt(i), str1Map.get(str1.charAt(i)) + 1);
            else str1Map.put(str1.charAt(i), 1);

            if (str2Map.containsKey(str2.charAt(i))) str2Map.put(str2.charAt(i), str2Map.get(str2.charAt(i)) + 1);
            else str2Map.put(str2.charAt(i), 1);
        }
        for (char k : str1Map.keySet()) {
            if (!str1Map.get(k).equals(str2Map.get(k))) return false;
        }

        return true;
    }

    private static boolean checkIfPalindromePermutation(String str1,String str2){
        return isPalindrome(str1) && isPalindrome(str2) && checkIfContainsSameCharacters(str1,str2);
    }

    public static void main(String[] args) {
        System.out.println(checkIfPalindromePermutation("ABA", "ABA"));
        System.out.println(checkIfPalindromePermutation("taco cat", "atco cta"));
    }
}
