import java.util.*;

class CountVandC {
    public static void countVandC(String str) {
        int v = 0, c = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if it is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
        }

        System.out.println("The vowel count is: " + v);
        System.out.println("The consonant count is: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        countVandC(str);
        sc.close();
    }
}
