// User function Template for Java
class Solution {
    static String isDeficient(long x) {
        
        int sum =0;
        for(int i=1;i<=x;i++){
            if(x%i ==0){
                sum += i;
            }
        }
        
        return (2*x > sum) ? "YES" : "NO";
    }
    public static void main(String[] args) {
        long x = 8L;
        String result = isDeficient(x);
        System.out.println("Is " + x + " a deficient number? " + result);
    }
}


// Examples:
// Input: x = 8
// Output: "YES"
// Explanation: The divisors of 8 are 1, 2, 4, and 8.
// Their sum is 15, which is less than 2*8 = 16, so 8 is a deficient number.