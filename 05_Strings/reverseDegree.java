class Solution {
    public int reverseDegree(String s) {
        int count =0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                count += ('z' - ch + 1)*(i+1);
            }
        }

        return count;
        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        int result = solution.reverseDegree(s);
        System.out.println(result); // Output: 12
    }
}


// Examples:
// Input: s = "abc"
// For each character, multiply its position in the reversed 
// alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).

// Input: s = "abc"
// Output: 148
// Explanation:
// Letter	Index in Reversed Alphabet	Index in String	Product
// 'a'	26	1	26
// 'b'	25	2	50
// 'c'	24	3	72
// The reversed degree is 26 + 50 + 72 = 148.