class longestSubarray {
    public int LongestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 9; // Example target sum
        int result = LongestSubarray(nums, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + result);
    }
}

// Examples:
// Input: nums = [1,2,3,4,5], k = 9
// Output: 3
// Explanation: The subarray [2,3,4] has the sum 9 and length 3.
