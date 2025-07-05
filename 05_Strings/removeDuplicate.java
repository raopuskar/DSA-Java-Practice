import java.util.*;

class RemoveDuplicate {
    public static void removeDuplicate(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1); // it checks if the character appears again in the string after the current index
            // If idx is -1, it means the character does not appear again in the string
            if (idx == -1) {
                newStr.append(ch);
            }
        }

        System.out.print("String after removing duplicates: " + newStr.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        removeDuplicate(input);
        sc.close();
    }
}
