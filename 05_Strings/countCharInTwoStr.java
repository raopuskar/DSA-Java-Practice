class Solution {
    int sameChar(String A, String B) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (Character.toLowerCase(A.charAt(i)) == Character.toLowerCase(B.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "aBcDeF";
        String B = "Abcdef";
        int result = sol.sameChar(A, B);
        System.out.println("Number of positions with same character (case-insensitive): " + result);
    }
}

// Example usage:
// Input: A = "aBcDeF", B = "Abcdef"
// Output: 4
// Explanation: The characters at positions 1, 2, 4, and 5 are the same when case is ignored.
