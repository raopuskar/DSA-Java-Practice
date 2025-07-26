import java.util.*;

public class phoneNumCom {
    static Map<Character, String> keypad = new HashMap<>();

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;

        keypad.put('2', "abc");
        keypad.put('3', "def");
        keypad.put('4', "ghi");
        keypad.put('5', "jkl");
        keypad.put('6', "mno");
        keypad.put('7', "pqrs");
        keypad.put('8', "tuv");
        keypad.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    public static void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = keypad.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(digits, index + 1, path, result);
            path.deleteCharAt(path.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);
        System.out.println("Combinations: " + combinations);
    }
}
