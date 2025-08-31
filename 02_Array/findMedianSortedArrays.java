import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;

        for (int val : nums1) merged[i++] = val;
        for (int val : nums2) merged[i++] = val;

        Arrays.sort(merged); // Sort the merged array

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2]; // Odd length → middle element
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0; // Even length → average of two middles
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result); // Output: 2.0
    }
}


// Examples:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
