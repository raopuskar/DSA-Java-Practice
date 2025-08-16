import java.util.*;

//isomoerphic string are throse strings that can be transformed into each other by replacing characters
//for example: "egg" and "add" are isomorphic, but "foo" and "bar" are not.

public class isIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();  //here we create two hashmaps to store the mapping of characters
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check if c1 is already mapped to a different char
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) return false;
            } else {
                map1.put(c1, c2);
            }                                              //we map both sides because we need to ensure that the mapping is one-to-one and onto so that we can transform one string into another

            // Check reverse mapping too
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s = sc.nextLine();
        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isIsomorphic(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are NOT isomorphic.");
        }

        sc.close();
    }
}

//Example Input:
// Enter first string: egg  
// Enter second string: add
// Example Output:
// Strings are isomorphic.