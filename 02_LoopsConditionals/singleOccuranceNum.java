public class singleOccuranceNum {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Example input
        int singleNum = singleNumber(nums);
        System.out.println("The number that occurs only once is: " + singleNum);
    }
}

//Other way to find single occurrence number is through HashMap
// import java.util.HashMap;
// public class singleOccuranceNum {
//     public static int singleNumber(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for (int num : map.keySet()) {
//             if (map.get(num) == 1) {
//                 return num;
//             }
//         }
//         return -1; // In case no single occurrence number is found
//     }
    
//     public static void main(String[] args) {
//         int[] nums = {4, 1, 2, 1, 2}; // Example input
//         int singleNum = singleNumber(nums);
//         System.out.println("The number that occurs only once is: " + singleNum);
//     }
// }

