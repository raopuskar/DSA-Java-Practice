// Description: This code counts the number of contiguous subarrays that sum to a given value k.
//and this code is a simple brute-force solution that checks all possible subarrays.
// It has a time complexity of O(n^2) and is not optimal for large arrays
import java.util.*;
public class SubarraySum {
    public static int countSubarraysWithSumK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 5};
        int k = 6;
        System.out.println("Count of subarrays with sum " + k + " is: " + countSubarraysWithSumK(nums, k));
    }
}

//So for optimal solution, we can use a HashMap to store the cumulative sum and its frequency.
// This allows us to find the number of subarrays with sum k in O(n) time

// import java.util.*;

// public class Main {
//     public static int countSubarraysWithSumK(int[] nums, int k) {
//         Map<Integer, Integer> prefixMap = new HashMap<>();
//         prefixMap.put(0, 1); // base case for sum = k at beginning

//         int sum = 0;
//         int count = 0;

//         for (int num : nums) {
//             sum += num;

//             if (prefixMap.containsKey(sum - k)) {
//                 count += prefixMap.get(sum - k);
//             }

//             prefixMap.put(sum, prefixMap.getOrDefault(sum, 0) + 1);
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length of array: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         System.out.print("Enter value of k: ");
//         int k = sc.nextInt();

//         int result = countSubarraysWithSumK(nums, k);
//         System.out.println("Number of subarrays with sum " + k + ": " + result);
//     }
// }
// // This code uses a HashMap to efficiently count the number of contiguous subarrays that sum to a given value k.
// It has a time complexity of O(n) and is suitable for larger arrays compared to the brute-force approach.
// The main method allows user input for the array and the target sum k, and then prints the count of subarrays that meet the criteria.
// The code is structured to be efficient and user-friendly, making it easy to test with different inputs.
// The first part of the code is a brute-force solution, while the second part is an optimal solution using a HashMap.
// The optimal solution is more efficient and suitable for larger datasets, while the brute-force solution is simpler and easier to understand for small arrays.
// The code is structured to be efficient and user-friendly, making it easy to test with different inputs.
