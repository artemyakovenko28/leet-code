package com.company;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            commonPrefix = findCommonPrefix(commonPrefix, strs[i]);
            if (commonPrefix.isEmpty()) {
                return commonPrefix;
            }
        }
        return commonPrefix;
    }

    private String findCommonPrefix(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return result.toString();
            }
            result.append(a.charAt(i));
        }
        return result.toString();
    }
}
