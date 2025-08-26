// User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        String binary = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '0'){
                sb.append('1');
            } else {
                sb.append(binary.charAt(i));
            }
        }
        
        int decimal = Integer.parseInt(sb.toString(), 2);
        int diff = decimal - N;
        
        return new int[]{diff,decimal};
        
    }
    public static void main(String[] args) {
        int N = 8;
        int[] result = changeBits(N);
        System.out.println("Difference: " + result[0] + ", New Decimal: " + result[1]);
    }
};

// Examples:
// Input: N = 8 
// Output: [7, 15]
// Explanation: The binary representation of 8 is "1000".
// By changing all '0's to '1's, we get "1111", which is 15 in decimal.
// The difference is 15 - 8 = 7.
