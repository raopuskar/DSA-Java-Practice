class Solution {
    public static boolean isBinary(String s) {
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '1' && ch != '0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1010101";
        boolean result = isBinary(s);
        System.out.println("Is the string binary? " + result);
    }

}


// Examples:
// Input: s = "1010101"
// Output: true
// Explanation: The string contains only '0's and '1's, so it is a binary string.
// Input: s = "12345"
// Output: false
// Explanation: The string contains characters other than '0' and '1', so it is not a binary string.