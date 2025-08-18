import java.util.*;

class Solution {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add all elements into min-heap
        for (int x : arr) pq.add(x);

        int count = 0;

        // keep combining until smallest element >= k
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size() < 2) return -1; // not possible

            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            pq.add(sum);

            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 10, 12, 9, 2, 3};
        int n = arr.length;
        int k = 6;

        int result = sol.minOperations(arr, n, k);
        System.out.println("Minimum operations required: " + result);
    }
}


// Example usage:
// Input:
// N = 6, K = 6 
// Arr[] = {1, 10, 12, 9, 2, 3}
// Output: 2
// Explanation: First we add (1 + 2), now the
// new list becomes 3 10 12 9 3, then we add
// (3 + 3), now the new list becomes 6 10 12 9,
// Now all the elements in the list are greater
// than 6. Hence the output is 2 i:e 2 operations
// are required to do this. 