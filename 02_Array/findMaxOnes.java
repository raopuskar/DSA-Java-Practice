public class findMaxOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0,max = 0;

        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                count++;
                if(count>max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }
}
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxOnes = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxOnes);
    }

