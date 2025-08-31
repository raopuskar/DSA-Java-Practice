class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "babad";
        String result = solution.longestPalindrome(s);
        System.out.println(result); // Output: "bab" or "aba"
    }
}


// Examples:
// Input: s = "babad"
// Output: "bab" or "aba"
// Explanation: "bab" and "aba" are both valid answers.
// Input: s = "cbbd"
// Output: "bb"
// Explanation: "bb" is the longest palindromic substring.
