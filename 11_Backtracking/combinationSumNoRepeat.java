import java.util.*;

public class combinationSumNoRepeat {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>());
        System.out.println("Unique combinations that sum to " + target + ":");
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
            // Skip duplicates at same recursive level
            if (i > start && nums[i] == nums[i - 1]) continue;

            if (nums[i] > target) break; // pruning

            path.add(nums[i]);
            backtrack(nums, target - nums[i], i + 1, path); // i + 1: use each number only once
            path.remove(path.size() - 1); // backtrack
        }
    }
}
