class Solution {
    public static char nonRepeatingChar(String s) {
        int[] freq = new int[26]; // assuming lowercase letters only

        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        return '$'; 
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = nonRepeatingChar(s);
        System.out.println("First non-repeating character: " + result);
    }
}


//Below are the examples
// Examples:
// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
// Input: s = "racecar"
// Output: 'e'
// Explanation: In the given string, 'e' is the only character in the string which does not repeat.
// Input: s = "aabbccc"
// Output: '$'
// Explanation: All the characters in the given string are repeating.
