import java.util.*;

class Main {
    public static int[] nextSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while stack top is >= current element
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }

            // If stack is empty → no smaller element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] res = nextSmallerElement(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
