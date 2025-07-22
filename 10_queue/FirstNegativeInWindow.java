import java.util.*;

public class FirstNegativeInWindow {

    public static void printFirstNegative(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            // Add index of negative element to the deque
            if (arr[i] < 0) {
                dq.offerLast(i);
            }

            // Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Start printing when we hit the first full window
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    System.out.print(arr[dq.peekFirst()] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 3;
        printFirstNegative(arr, k);
    }
}
