// User function Template for Java

import java.util.*;

class Solution {
    public String maximumFrequency(String s) {
        String[] words = s.split(" ");
        Map<String, Integer> freq = new LinkedHashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        String maxWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxWord + " " + maxCount;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "apple banana apple orange banana apple";
        String result = sol.maximumFrequency(s);
        System.out.println(result);
    }
}


// Examples:
// Input: s = "apple banana apple orange banana apple"
// Output: "apple 3"
// Explanation: The word "apple" appears most frequently (3 times) in the string.