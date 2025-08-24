class Solution {
    public int findSum(String s) {
        int sum = 0;
        String num = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch; // Build the number as a string
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num); // Convert and add
                    num = ""; // Reset for next number
                }
            }
        }

        // Add any number left at the end
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}


//Examples:
// Input: s = "1abc23"  
// Output: 24
// Explanation: The numbers in the string are 1 and 23. Their sum is
// 1 + 23 = 24.