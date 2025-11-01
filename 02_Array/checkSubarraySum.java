import java.util.*; //IMP
class check {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case for subarrays starting at index 0
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (remainder < 0) remainder += k; // handle negative k values

            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) return true; // subarray length >= 2
            } else {
                map.put(remainder, i); // store first occurrence only
            }
        }
        return false;
    }
}
