// User function Template for Java

class Solution {
    public String convert(String s) {
    StringBuilder str = new StringBuilder();
    boolean capitalizeNext = true;

    for (char ch : s.toCharArray()) {
        if (Character.isWhitespace(ch)) {
            str.append(ch);
            capitalizeNext = true;
        } else if (capitalizeNext) {
            str.append(Character.toUpperCase(ch));
            capitalizeNext = false;
        } else {
            str.append(Character.toLowerCase(ch));
        }
    }

    return str.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "hello world! this is a test.";
        String output = solution.convert(input);
        System.out.println(output); // Output: "Hello World! This Is A Test."
    }

}

// Examples:
// Input: s = "hello world! this is a test."
// Output: "Hello World! This Is A Test."
// Explanation: The first letter of each word is capitalized, and the rest are in lowercase