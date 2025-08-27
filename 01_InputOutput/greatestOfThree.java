class Solution {
    public int greatestOfThree(int a, int b, int c) {
        // code here
        int maxVal = Math.max(a, Math.max(b, c));
        
        return maxVal;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 10, b = 20, c = 15; // Example inputs
        int result = sol.greatestOfThree(a, b, c);
        System.out.println("The greatest of the three numbers is: " + result);
    }
}


