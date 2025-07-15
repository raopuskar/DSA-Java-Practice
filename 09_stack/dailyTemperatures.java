import java.util.*;

class dailyTemp {
    public static int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(T);
        System.out.println(Arrays.toString(res));  // [1, 1, 4, 2, 1, 1, 0, 0]
    }
}
