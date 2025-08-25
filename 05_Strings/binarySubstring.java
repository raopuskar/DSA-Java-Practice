class Solution {
    public int binarySubstring(String s) {
        int ones = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') ones++;
        }
        return (ones * (ones - 1)) / 2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "001101";
        int result = sol.binarySubstring(s);
        System.out.println("The number of binary substrings is: " + result);
    }
}

// Examples:
// Input: s = "001101"  
// Output: 6
// Explanation: The binary substrings are "00", "11", "01", "10", "01", "0011".

