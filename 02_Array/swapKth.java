import java.util.*;
class Solution {
    public static void swapKth(List<Integer> arr, int k) {
        int n = arr.size();
        int i = k - 1;         
        int j = n - k;        

        if (i >= 0 && j >= 0 && i < n && j < n) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }

    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;

        System.out.println("Original array: " + arr);
        swapKth(arr, k);
        System.out.println("Array after swapping " + k + "th elements: " + arr);
    }
}



// Examples :

// Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
// Output: [1, 2, 6, 4, 5, 3, 7, 8]
// Explanation: 3rd element from beginning is 3 and 3rd element from end is 6, so we replace 3 & 6.
// Input: arr[] = [5, 3, 6, 1, 2], k = 2
// Output: [5, 1, 6, 3, 2]
// Explanation: 2nd element from beginning is 3 and from end is 1.