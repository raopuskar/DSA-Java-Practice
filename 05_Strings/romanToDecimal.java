class Solution {
    public int romanToDecimal(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = roman.get(s.charAt(i));
            if (curr < prev) {
                total -= curr;
            } else {
                total += curr;
            }
            prev = curr;
        }

        return total;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "MCMIV";
        int result = sol.romanToDecimal(s);
        System.out.println("The decimal value of the Roman numeral " + s + " is: " + result);
    }
}

// Examples:
// Input: s = "MCMIV"   
// Output: 1904
// Explanation: M = 1000, CM = 900, IV = 4; thus, MCMIV = 1000 + 900 + 4 = 1904