class Main {
    public static void moveZerosToEnd(int[] nums) {
        int count = 0; // Position to place the next non-zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3, 0, 4};
        moveZerosToEnd(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
