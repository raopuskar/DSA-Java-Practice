import java.util.*;

public class twoSum {
    public static int[] twoSumm(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {}; // No solution
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSumm(nums, target);
        if (result.length == 2)
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        else
            System.out.println("No valid pair found");

        sc.close();
    }
}
