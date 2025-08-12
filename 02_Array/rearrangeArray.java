import java.util.ArrayList;
import java.util.List;

class rearrangeArray {
    public static int[] rearrangeArrayy(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0, neg = 0;

        // Find all positive and negative numbers
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) positives.add(num);
            else negatives.add(num);
        }

        // Interleave them starting with positive
        for (int i = 0; i < n; i++) {
            result[i] = (i % 2 == 0) ? positives.get(pos++) : negatives.get(neg++);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, 5, -6}; // Example input
        int[] rearranged = rearrangeArrayy(nums);

        System.out.print("Rearranged array: ");
        for (int num : rearranged) {
            System.out.print(num + " ");
        }
    }
}
