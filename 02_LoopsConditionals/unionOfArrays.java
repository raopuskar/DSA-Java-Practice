import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        // Use LinkedHashSet to preserve order
        Set<Integer> set = new LinkedHashSet<>();

        // Add elements from first array
        for (int num : nums1) {
            set.add(num);
        }

        // Add elements from second array
        for (int num : nums2) {
            set.add(num);
        }

        // Convert Set to int[]
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] union = sol.unionArray(arr1, arr2);

        System.out.print("Union of arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
