// Example Input:
 // Enter the length of array: 5
 // Enter the array elements:
 // 1 2 3 4 5
 // Example Output:
 // Maximum subarray sum: 12

 // This code finds the maximum subarray sum using a prefix sum approach.
class PrefixSumArr {
    public static int maxSubarraySumm(int[] arr) {
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
        int result = maxSubarraySumm(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
