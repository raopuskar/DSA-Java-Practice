// This code finds the highest occurring character in a given string and counts its occurrences.
// It uses an array to keep track of the frequency of each character from 'a' to 'z'.
// The time complexity is O(n), where n is the length of the string, as it iterates through the string once to count frequencies and then iterates through the frequency array to find the maximum frequency character. The space complexity is O(1) since the size of the frequency array is constant (26 for lowercase letters).
// The code handles both uppercase and lowercase letters by converting the input string to lowercase before processing.
public class FindHighestOccurringChar {
    public static void findHighestOccurringChar(String str) {
        int[] freq = new int[26]; // For 'a' to 'z'
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        int maxFreq = 0;
        char maxChar = ' ';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'a');
            }
        }

        System.out.println("Highest occurring character: " + maxChar);
        System.out.println("It occurred " + maxFreq + " times.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        findHighestOccurringChar(input);
        sc.close();
    }
}