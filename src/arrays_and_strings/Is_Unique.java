package arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shreejan Acharya on 6/29/2023
 * @project coding_interview
 */

/*
 * 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 * */
public class Is_Unique {
    /*
     *CHECK IF THE STRING CONTAINS UNIQUE CHARACTERS
     */
    public static boolean isStringUnique(String str) {
        Map<Character, Integer> charCountInString = new HashMap<>();
        for (char c :
                str.toCharArray()) {
            if (charCountInString.containsKey(c)) return false;
            else charCountInString.put(c, 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringUnique("SSII"));
        System.out.println(isStringUnique("ABCDEF"));
    }
}
