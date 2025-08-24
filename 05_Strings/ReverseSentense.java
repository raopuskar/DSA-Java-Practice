import java.util.*;

class ReverseSentense {
    public static void reverseWords(String sentence) {  //Eg "Hello World!" -> "World! Hello"
        String[] words = sentence.trim().split("\\s+"); // .trim remove leading and trailing spaces like " Hello world!" -> "Hello World!", .split("\\s+") splits by whitespace and it Splits on 1 or more spaces. eg ["Hello", "World!"]
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {  //length = 2
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed sentence: " + reversed.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        reverseWords(input);
        sc.close();
    }
}
