
class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (String word : strs) {
            if (!word.startsWith(prefix)) {
                int length = prefix.length();
                if (length == 1) {
                    return "";
                }
                if (length == 2) {
                    prefix = prefix.substring(0, 1);
                    continue;
                }
                prefix = prefix.substring(0, length - 2);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = { "ab", "a" };
        longestCommonPrefix(str);
        char[] a = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println(a);
    }
}