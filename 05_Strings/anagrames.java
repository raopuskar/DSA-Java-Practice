import java.util.*;

class Anagrams {
    public static boolean anagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;  // count[0] for 'a', count[1] for 'b', ..., count[25] for 'z' and for any char we increment the count like 1
            count[str2.charAt(i) - 'a']--; // for str2 we decrement the count
        }

        for (int c : count) {  //  WE traverse the count array to check if all counts are zero
            // If any count is not zero, it means the characters do not match
            if (c != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the 2nd string: ");
        String str2 = sc.nextLine();

        if (anagrams(str1, str2)) {
            System.out.print("✅ Both strings are anagrams");
        } else {
            System.out.print("❌ Not anagrams");
        }

        sc.close();
    }
}
