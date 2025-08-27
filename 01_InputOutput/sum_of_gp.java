import java.util.*;

class Solution {
    public long sum_of_gp(long n, long a, long r) {
        long sum = 0;
        if(r==1){
            sum = n*a;
        }else{
            sum = a*((long)Math.pow(r,n)-1)/(r-1);
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        long n = 3; // Example input
        long a = 2; // Example input
        long r = 3; // Example input
        long result = sol.sum_of_gp(n, a, r);
        System.out.println("Sum of the first " + n + " terms of the GP series is: " + result);
    }
}

// Examples:
// Input: n = 3, a = 2, r = 3
// Output: 26
// Explanation: The first 3 terms of the GP series are 2, 6, and 18.
// Their sum is 2 + 6 + 18 = 26.