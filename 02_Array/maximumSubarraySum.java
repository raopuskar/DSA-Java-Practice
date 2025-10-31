import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();   //[1,5,4,2,9,9,9]
        long sum = 0;                         // 1+5+4=10 then next window 5+4+2=11 then next 4+2+9=15 
        long Max = 0;                         // aur last wala minus krte jaao qki K size ka hi chahiye
        int left = 0;

        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size() == k){  //agar elment nhi hai ya(Duplicate check karega) size k ke barabar hai to left se remove krte jao
                set.remove(nums[left]);  //last element remove krdo
                sum -= nums[left]; //sum me se bhi minus krdo qki 1+5+4=10 chahiye aage jaye to 5+4+2=11 toh 1 ko minus krdo
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