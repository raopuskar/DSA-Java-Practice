import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSquareSum(n);
        }

        return n == 1;
    }

    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 19;
        boolean result = solution.isHappy(n);
        System.out.println(result); // Output: true
    }
}


// Examples:
// Input: n = 19
// Output: true
// Explanation: 1^2 + 9^2 = 82
//              8^2 + 2^2 = 68
//              6^2 + 8^2 = 100
//              1^2 + 0^2 + 0^2 = 1
// Input: n = 2
// Output: false
// Explanation: 2^2 = 4, 4^2 = 16, 1^2 + 6^2 = 37, 3^2 + 7^2 = 58, 5^2 + 8^2 = 89, 8^2 + 9^2 = 145, 
//1^2 + 4^2 + 5^2 = 42, 4^2 + 2^2 = 20, 2^2 + 0^2 = 4 (cycle)
