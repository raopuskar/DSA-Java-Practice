class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int A = a, B = b;  // store original values
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int gcd = a;  
        int lcm = (A * B) / gcd;  // LCM formula
        
        return new int[]{lcm, gcd};
    }
    public static void main(String[] args) {
        int a = 12, b = 15;
        int[] result = lcmAndGcd(a, b);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
}


// Examples:
// Input: a = 12, b = 15
// Output: [60, 3]
// Explanation: The LCM of 12 and 15 is 60, and the GCD is 3.
