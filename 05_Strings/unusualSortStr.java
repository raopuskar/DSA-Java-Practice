// User function Template for Java
import java.util.*;

class Sol {
    public static String stringSort(String s) {
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();
        
        // Separate uppercase and lowercase
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper.add(ch);
            } else {
                lower.add(ch);
            }
        }
        
        // Sort both lists
        Collections.sort(upper);
        Collections.sort(lower);
        
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        
        // Merge alternately
        while (i < upper.size() && j < lower.size()) {
            sb.append(upper.get(i++));
            sb.append(lower.get(j++));
        }
        
        // Append remaining chars
        while (i < upper.size()) sb.append(upper.get(i++));
        while (j < lower.size()) sb.append(lower.get(j++));
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "bAwutndekWEdkd";
        System.out.println(stringSort(s));
    }
}
