import java.util.*;

class Solution {
    public String is_AutomorphicNumber(int n) {
        int sqr = (int)Math.pow(n,2);
        String str = String.valueOf(n);
        String str1 = String.valueOf(sqr);
        
        return (str.charAt(str.length()-1) == str1.charAt(str1.length()-1) ? "Automorphic" : "Not Automorphic");
        
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 76; // Example input
        String result = sol.is_AutomorphicNumber(n);
        System.out.println(n + " is an " + result + " number.");
    }
}

// Examples:
// Input: n = 76
// Output: Automorphic
// Explanation: 76^2 = 5776, which ends with 76, so 76 is an Automorphic number.