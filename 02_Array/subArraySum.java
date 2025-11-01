import java.util.*;   //IMP
class subArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: sum = 0 appears once

        for (int num : nums) {
            currSum += num;

            // If (currSum - k) exists, it means there’s a subarray that sums to k
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Store the current prefix sum
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
    public static void main(String args[]){
        subArraySum obj = new subArraySum();
        int[] nums = {1,1,1};
        int k = 2;
        int result = obj.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " is: " + result);
    }
}
