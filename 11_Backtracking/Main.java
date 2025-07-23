import java.util.*;

public class Main {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        backtrack(new ArrayList<>(), nums, 0);
        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    static void backtrack(List<Integer> current, int[] nums, int index) {
        // Add the current subset to result
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(current, nums, i + 1);

            // Unchoose (Backtrack)
            current.remove(current.size() - 1);
        }
    }
}
