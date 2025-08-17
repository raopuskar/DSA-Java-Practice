class Solution {
    public int findElement(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1; // need both left and right sides

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        // Only check 1..n-2 (must have both sides)
        for (int i = 1; i <= n - 2; i++) {
            if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}



// Example usage:
// Input: arr = [4, 2, 5, 7]
// Output: 5
// Explanation: Elements on left of 5 are smaller than 5 and on right of it are greater than 5.
// Input: arr = [11, 9, 12]
// Output: -1
// Explanation: As no element here which we can say smaller in left & greater in right.