class Solution {
    static Long oddGame(Long N) {
        long ans = 1L;

        while (ans * 2 <= N) {
            ans *= 2;
        }

        return ans;
    }
    public static void main(String[] args) {
        Long N = 8L;
        Long result = oddGame(N);
        System.out.println("Largest power of 2 less than or equal to " + N + " is: " + result);
    }
}

//dry run
// Input: N = 8
// Output: 8
// Explanation: The largest power of 2 less than or equal to 8 is 8 itself (2^3 = 8).
