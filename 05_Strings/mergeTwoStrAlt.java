// User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();
        StringBuilder str = new StringBuilder();
        
        // Merge characters alternately
        int i = 0, j = 0;
        while (i < n && j < m) {
            str.append(S1.charAt(i));
            str.append(S2.charAt(j));
            i++;
            j++;
        }
        
        // Add remaining characters of S1
        while (i < n) {
            str.append(S1.charAt(i));
            i++;
        }
        
        // Add remaining characters of S2
        while (j < m) {
            str.append(S2.charAt(j));
            j++;
        }
        
        return str.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S1 = "abc";
        String S2 = "pqr";
        String result = solution.merge(S1, S2);
        System.out.println(result); // Output: "apbqcr"
    }
}

// Examples:
// Input: S1 = "abc", S2 = "pqr"    
// Output: "apbqcr"
// Explanation: Characters from S1 and S2 are merged alternately.
