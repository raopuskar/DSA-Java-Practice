class twoSum {
    public static int[] twoSumm(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example input
        int target = 9; // Example target sum
        int[] result = twoSumm(nums, target);

        if (result[0] != 0 || result[1] != 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found");
        }
    }
}
