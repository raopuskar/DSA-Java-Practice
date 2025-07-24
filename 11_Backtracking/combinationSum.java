import java.util.*;

public class combinationSum {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Arrays.sort(candidates); // Optional: helps with pruning
        backtrack(candidates, target, 0, new ArrayList<>());
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }

    static void backtrack(int[] nums, int target, int start, List<Integer> path) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) break; // No need to continue if number exceeds target

            path.add(nums[i]);
            backtrack(nums, target - nums[i], i, path); // Reuse same element
            path.remove(path.size() - 1); // Backtrack
        }
    }
}
