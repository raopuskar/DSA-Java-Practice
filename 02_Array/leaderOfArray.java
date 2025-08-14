import java.util.ArrayList;
class leaderOfArray {
    public static ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                result.add(nums[i]);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2}; // Example input
        ArrayList<Integer> leaders = leaders(nums);

        System.out.print("Leaders in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }


}
