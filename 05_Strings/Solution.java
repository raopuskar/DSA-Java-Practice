import java.util.Stack;
public class Solution {
    static int maxLen(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base for length calculation
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    maxLen = Math.max(maxLen, i - stack.peek());
                } else {
                    stack.push(i); // Reset base
                }
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String s = "((())";
        int result = maxLen(s);
        System.out.println("The length of the longest valid parentheses substring is: " + result);
    }
}

// Examples:
// Input: s = "((())"   
// Output: 4
// Explanation: The longest valid parentheses substring is "(())", which has a length of 4
