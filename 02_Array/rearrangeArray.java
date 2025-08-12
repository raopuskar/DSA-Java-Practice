class rearrangeArray {
    public static int[] rearrangeArrayy(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = 0, neg = 0;

        // Find starting indices for positive and negative numbers
        while (nums[pos] < 0) pos++;
        while (nums[neg] >= 0) neg++;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[pos++];
                while (pos < n && nums[pos] < 0) pos++;
            } else {
                result[i] = nums[neg++];
                while (neg < n && nums[neg] >= 0) neg++;
            }
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
