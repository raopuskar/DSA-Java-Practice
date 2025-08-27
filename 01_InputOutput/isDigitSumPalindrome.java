// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum =0;
        
        while(n > 0) {
        sum += n % 10;  // get last digit
        n /= 10;        // remove last digit
        }
        
        String str = String.valueOf(sum);

        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12321; // Example input
        boolean result = sol.isDigitSumPalindrome(n);
        System.out.println("Is the sum of digits a palindrome? " + result);
    }
}

// Examples:
// Input: n = 12321
// Output: true
// Explanation: The sum of digits is 1+2+3+2+1 = 9, which is a palindrome.