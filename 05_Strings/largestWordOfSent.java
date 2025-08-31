import java.util.*;

class largestWordOfSent {
    public static void largestWords(String sentence) {
        String[] words = sentence.trim().split("\\s+"); // convert the sentence into an array of words
        String larger = "";
        int length = 0;

        for (String i : words) {  //traverse through each word in the array and check its length
            if(i.length() > length){
                larger = i;
                length = i.length();
            }
        }

        System.out.println("Largest word: " + larger);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        largestWords(input);
        sc.close();
    }
}


// Example:
// Input: "The quick brown fox jumps over the lazy dog"
// Output: "jumps"
// Explanation: The largest word in the sentence is "jumps" with 5 letters.
