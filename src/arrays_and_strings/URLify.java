package arrays_and_strings;

/**
 * @author Shreejan Acharya on 6/29/2023
 * @project coding_interview
 */
public class URLify {
    public static String urlify(String str) {
        char[] strArray = str.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == ' ') {
                newString.append("%20");
            } else {
                newString.append(strArray[i]);
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(urlify("JOHN SM"));
    }
}
