import java.util.*;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window
            if (!dq.isEmpty() && dq.peek() <= i - k) {   //ye ckeck ensures that we only keep indices of elements that are within the current window
                dq.poll();   //poll is pop in deque
            }

            // Remove all elements smaller than the current one
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();  //pollLast removes the last element from the deque
            }

            dq.offer(i);  // Add current index to the deque is push in queue

            // Store the result when the window reaches size k
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        System.out.println("Output: " + Arrays.toString(res));  // [3, 3, 5, 5, 6, 7]
    }
}



//Brute force approach

// import java.util.*;
// public class BruteForceSlidingWindow {
//     public static int[] maxSlidingWindow(int[] nums, int k) {
//         int n = nums.length;
//         int[] result = new int[n - k + 1];

//         for (int i = 0; i <= n - k; i++) {
//             int max = nums[i];
//             for (int j = i; j < i + k; j++) {
//                 if (nums[j] > max) {
//                     max = nums[j];
//                 }
//             }
//             result[i] = max;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//         int k = 3;
//         int[] result = maxSlidingWindow(nums, k);
//         System.out.println(Arrays.toString(result));
//     }
// }
