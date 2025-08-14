class leaderOfArray {
    public ArrayList<Integer> leaders(int[] nums) {
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
    
}
