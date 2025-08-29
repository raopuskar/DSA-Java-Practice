import java.util.*;

class Solution {
    public long smallestNumber(long num) {
        // Convert absolute value to char array
        // Maths.abs to handle negative numbers, ye negative sign ko alag handle karenge jaise wo use nahi hua ho
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();

        // Sort digits
        Arrays.sort(digits);

        if (num >= 0) {
            // Positive number: arrange digits in ascending order
            // Handle leading zero by swapping with first non-zero
            if (digits[0] == '0') {
                for (int i = 1; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
            String sortedNum = new String(digits);
            return Long.parseLong(sortedNum);

        } else {
            // Negative number: arrange digits in descending order
            String sortedAsc = new String(digits);
            String sortedDesc = new StringBuilder(sortedAsc).reverse().toString();
            return Long.parseLong("-" + sortedDesc);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        long num = -7605;
        long result = solution.smallestNumber(num);
        System.out.println(result); // Output: -7650
    }
}


// Examples:
// Input: num = 310
// Output: 103
// Explanation: The smallest number formed by the digits is 103.If there are leading zeros, they are ignored like
//all the possible smalest numbers are 013, 031, 103, 130, 301 and 310. So, the output is 103.
// Input: num = -7605
// Output: -7650
// Explanation: The smallest number formed by the digits is -7650.
