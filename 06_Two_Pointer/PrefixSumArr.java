class Main {
    public static int maxSubarraySum(int[] arr) {
        int Sum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // Start new subarray if currentSum drops below zero
            Sum += arr[i];
            if(Sum > maxSum){
                maxSum = Sum;
            }
            if(Sum<0){
                Sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
