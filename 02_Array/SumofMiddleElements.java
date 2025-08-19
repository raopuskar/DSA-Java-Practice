// User function Template for Java
import java.util.Arrays;
class Solution {
    public static int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            result[n1 + i] = arr2[i];
        }
        
        Arrays.sort(result);
        
        return result[n1-1]+result[n1];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int result = SumofMiddleElements(arr1, arr2);
        System.out.println("Sum of middle elements: " + result);
    }
}

// Examples:

// Input: arr1 = [1, 2, 4, 6, 10], arr2 = [4, 5, 6, 9, 12]
// Output: 11
// Explanation: The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9, 10, 12]. Sum of middle elements is 11 (5 + 6).
// Input: arr1 = [1, 12, 15, 26, 38], arr2 = [2, 13, 17, 30, 45]
// Output: 32
// Explanation: The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).