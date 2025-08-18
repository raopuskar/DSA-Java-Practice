import java.util.*;

class Solution {
    public static boolean isSubset(int[] a, int[] b) {
        if (b.length > a.length) return false;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] == b[j]) {
                i++; j++;   
            } else {
                return false; 
            }
        }
        return j == b.length;
    }
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        
        boolean result = isSubset(a, b);
        System.out.println("Is b[] a subset of a[]? " + result);
    }
}

// Example usage
// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: true
// Explanation: b[] is a subset of a[]
// Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
// Output: true
// Explanation: b[] is a subset of a[]
// Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
// Output: false
// Explanation: b[] is not a subset of a[]
