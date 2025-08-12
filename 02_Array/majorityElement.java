class majorityElement {
    public int majorityElementt(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        int[] nums = {3, 2, 3}; // Example input
        int result = me.majorityElementt(nums);
        System.out.println("The majority element is: " + result);
    }
}