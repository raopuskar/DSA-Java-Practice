class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long sum = 0;
        long Max = 0;
        int left = 0;

        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);

            if(set.size() == k){
                Max = Math.max(sum,Max);
            }
        }
        
        return Max;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        long result = sol.maximumSubarraySum(nums, k);
        System.out.println("Maximum subarray sum with " + k + " distinct elements is: " + result);
    }
}