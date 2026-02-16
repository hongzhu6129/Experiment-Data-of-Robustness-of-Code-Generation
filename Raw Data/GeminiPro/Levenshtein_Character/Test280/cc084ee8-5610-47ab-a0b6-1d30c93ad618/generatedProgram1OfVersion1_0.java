class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        int[][] dp = new int[n][n];
        int start = 0;
        int maxLen = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j <= i + 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] > 0 && j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
