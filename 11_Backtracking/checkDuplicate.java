import java.util.*;

public class checkDuplicate {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        Arrays.sort(nums);  // Important: sort first
        backtrack(new ArrayList<>(), nums, 0);
        System.out.println("Unique subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    static void backtrack(List<Integer> current, int[] nums, int start) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates at the same tree level
            if (i > start && nums[i] == nums[i - 1]) continue;

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(current, nums, i + 1);

            // Unchoose
            current.remove(current.size() - 1);
        }
    }
}
