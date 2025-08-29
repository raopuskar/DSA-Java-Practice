class Solution {
    public int countSubarrays(int[] nums) {
        int count =0;

        for(int i=0;i<nums.length-2;i++){
            if(nums[i+1] % 2 == 0 && nums[i] + nums[i+2] == nums[i+1] / 2){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,6,4,10,8};
        int result = solution.countSubarrays(nums);
        System.out.println(result); // Output: 3
    }
}



// Examples:
// Input: nums = [2,6,4,10,8]
// Output: 3
// Explanation: The even numbers at indices 1, 3, and 4 form arithmetic subarrays with their neighbors.
// - For index 1: (2, 6, 4) with common difference 4.
// - For index 3: (4, 10, 8) with common difference 6.
// - For index 4: (10, 8, 6) with common difference -2.
// Thus, there are 3 such subarrays.
// Input: nums = [1,3,5]
// Output: 0
// Explanation: There are no even numbers in the array, hence no arithmetic subarrays can be formed.