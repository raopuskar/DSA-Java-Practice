import java.util.*;

public class FirstNonRepeating {
    public static String firstNonRepeating(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            // Remove characters from front with freq > 1
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabc";
        System.out.println("Output: " + firstNonRepeating(input)); // a#bb
    }
}
