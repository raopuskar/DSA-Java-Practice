class Solution {
    public int prime_Sum(int n) {
        int sum = 0;
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                sum += i;
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10; // Example input
        int result = sol.prime_Sum(n);
        System.out.println("Sum of prime numbers up to " + n + " is: " + result);
    }
}


// Examples:
// Input: n = 10
// Output: 17
// Explanation: The prime numbers up to 10 are 2, 3, 5, and 7.
// Their sum is 2 + 3 + 5 + 7 = 17.
