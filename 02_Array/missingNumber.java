public class missingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4}; // Example input
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}


//This quickly finds the missing number in an array containing n distinct numbers from 0 to n.  
