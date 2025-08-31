import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        List<String> result = solution.fizzBuzz(n);
        System.out.println(result); // Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
    }
}


// Examples:
// Input: n = 3
// Output: ["1","2","Fizz"] 
// Explanation: 1 and 2 are not multiples of 3 or 5, so they are represented by their own numbers.
// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Explanation: 3 is a multiple of 3, so it is replaced by "Fizz". 5 is a multiple of 5, 
//so it is replaced by "Buzz".