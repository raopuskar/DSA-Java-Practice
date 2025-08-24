class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLength = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink window if more than one zero
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update maxLength (we must delete one element)
            maxLength = Math.max(maxLength, right - left);
            right++;
        }

        return maxLength;
    }
}

// Examples:
// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: Delete the 0 at index 2, and the longest subarray of 1s is of length 3.
// Input: nums = [0,1,1,1,0,1,1,0,1]
// Output: 5
// Explanation: Delete the 0 at index 4, and the longest subarray of 1s is of length 5.