// User function Template for Java

class Solution {
    int isPerfect(int N) {
        int original = N;
        int sum = 0;
        
        while(N>0){
            sum += factorial(N%10);
            N /= 10;
        }
        
        return (sum == original ? 1 : 0);
    }
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 145; // Example input
        int result = sol.isPerfect(N);
        System.out.println("Is " + N + " a strong number? " + (result == 1 ? "Yes" : "No"));
    }
}

// Examples:
// Input: N = 145   
// Output: 1
// Explanation: 1! + 4! + 5! = 145, so 145 is a strong number.
// Input: N = 123
// Output: 0
// Explanation: 1! + 2! + 3! = 9, which is not equal to 123, so 123 is not a strong number.