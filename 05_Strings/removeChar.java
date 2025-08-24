import java.util.*;

class Solution {
    static String C(String str1, String str2) {
        Set<Character> removeSet = new HashSet<>();
        for (char ch : str2.toCharArray()) {
            removeSet.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : str1.toCharArray()) {
            if (!removeSet.contains(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}


// Examples:
// Input: str1 = "abcdef", str2 = "bd"
// Output: "acef"
// Explanation: Characters 'b' and 'd' from str1 are present in str2, so they are removed from str1.