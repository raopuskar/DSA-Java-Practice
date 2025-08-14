import java.util.*;

class longestConsecutive {
    public static int longestConsecutivee(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else {
                longest = Math.max(longest, currentStreak);
                currentStreak = 1;
            }
        }

        return Math.max(longest, currentStreak);
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2}; // Example input
        int result = longestConsecutivee(nums);

        System.out.println("Length of the longest consecutive sequence: " + result);
    }
}
