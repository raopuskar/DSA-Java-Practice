import java.util.*;

class CountDistinctInWindow {
    public static void countDistinctInWindow(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(map.size() + " ");

        // Remaining windows
        for (int i = k; i < arr.length; i++) {
            // Remove element going out of window
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            // Add new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            System.out.print(map.size() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinctInWindow(arr, k);
    }
}
