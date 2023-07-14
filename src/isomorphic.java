
/*
* Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.
For example,"egg" and "add" are isomorphic, "foo" and "bar" are not

Examples:

Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

Input:  str1 = “aab”, str2 = “xyz”
Output: False
*
* */
public class isomorphic {

    public static boolean isomorphic(char[] ch1, char[] ch2) {
        boolean status = false;
        for (int i = 0; i < ch1.length - 1; i++) {
            if (ch1.length == ch2.length) {
                if (ch1[i] != ch1[i + 1]) {
                    if (ch2[i] != ch2[i + 1]) {
                        status = true;
                    }

                }
                if (ch1[i] == ch1[i + 1]) {
                        if (ch2[i] == ch2[i + 1]) {
                            status = true;
                        }
                }
            }
        }
        return status;
    }

    public static void main(String[] args) {
        String str1 = "aab", str2 = "xxy";
        System.out.println(isomorphic(str1.toCharArray(), str2.toCharArray()));
    }
}
