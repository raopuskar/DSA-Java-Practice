import java.util.*;

class ToggleCase {
    public static void toggleCase(String str) {
        StringBuilder toggledStr = new StringBuilder(); // Use StringBuilder to build the new string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                toggledStr.append(Character.toLowerCase(ch)); // Convert to lowercase
            } else {
                toggledStr.append(Character.toUpperCase(ch)); // Convert to uppercase
            }
        }
        System.out.print(toggledStr.toString()); // Print the toggled string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        toggleCase(str);
        sc.close();
    }
}
