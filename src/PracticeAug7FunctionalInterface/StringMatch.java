package PracticeAug7FunctionalInterface;

/*
Given 2 strings, a and b, return the number of the positions where
they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since
the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class StringMatch {

    public int stringMatch(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(),b.length());

        for (int i = 0; i < len-1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "xxaabcd";
        String str2 = "xxbcd";

    StringMatch stringMatch = new StringMatch();
        System.out.println(stringMatch.stringMatch(str1, str2));

    }

}
