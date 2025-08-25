class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].isEmpty()){
            sb.append(str[i]);
            sb.append('.');
            }
        }
        // Remove the trailing dot if it exists, trailing dot means last character is dot
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        return sb.toString();
    }
}


//OR THROUGH ARRAY LIST
// class Solution {
//     public String reverseWords(String s) {
//         String[] parts = s.split("\\."); // Split by dot
//         List<String> words = new ArrayList<>();
        
//         // Filter out empty strings
//         for (String word : parts) {
//             if (!word.isEmpty()) {
//                 words.add(word);
//             }
//         }
        
//         // Reverse the list
//         Collections.reverse(words);
        
//         // Join with dot separator
//         return String.join(".", words);
//     }
// }



// Examples:
// Input: s = "i.like.this.program.very.much"
// Output: "much.very.program.this.like.i"
// Explanation: The words of the input string are reversed.
// Input: s = "..pqr.mno.."
// Output: "mno.pqr"
// Explanation: The words of the input string are reversed. Note that the leading, trailing and multiple dots between words are ignored.