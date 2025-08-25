class findLongestAndSmallest {
    public static void findLongestAndSmallestt(String s) {
        String str = s.trim();
        String[] words = str.split("\\s+"); // Handles multiple spaces
        if (words.length == 0) {
            System.out.println("No words found.");
            return;
        }

        String longest = words[0];
        String smallest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Smallest word: " + smallest);
    }

    public static void main(String[] args) {
        String input = "Java is a powerful and elegant programming language";
        findLongestAndSmallestt(input);
    }
}


// Examples:
// Input: "Java is a powerful and elegant programming language"
// Output: Longest word: programming
//         Smallest word: a