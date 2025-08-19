import java.util.*;

class Solution {
    public static void rearrange(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        int left = 0, right = n - 1;
        while (left <= right) {
            if (left != right) {
                result.add(arr[right--]); // largest
                result.add(arr[left++]);  // smallest
            } else {
                result.add(arr[left++]);  // middle element (odd length)
            }
        }

        // copy back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = result.get(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr);
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}


// Examples:

// Input: arr[] = [1, 2, 3, 4, 5, 6]
// Output: [6, 1, 5, 2, 4, 3]
// Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is: [6, 1, 5, 2, 4, 3]
// Input: arr[]= [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
// Output: [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
// Explanation: Max element = 110, min = 10, second max = 100, second min = 20, and so on... Modified array is : [110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60]
// Input: arr[]= [1]
// Output: [1]
