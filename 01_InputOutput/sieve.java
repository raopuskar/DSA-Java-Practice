import java.util.*;
class Solution {
    public int[] sieve(int n) {
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
                
        }
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 30; // Example input
        int[] result = sol.sieve(n);
        System.out.println("Prime numbers up to " + n + " are: " + Arrays.toString(result));
    }
}


// Examples:
// Input: n = 30    
// Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
// Explanation: The prime numbers up to 30 are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
