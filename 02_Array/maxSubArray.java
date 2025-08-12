class maxSubArray {
    public static int maxSubArrayy(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example input
        int result = maxSubArrayy(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
