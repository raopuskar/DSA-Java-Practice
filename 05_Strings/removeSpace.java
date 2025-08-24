class Solution {

    String modify(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                str.append(ch);
            }
        }
        
        return str.toString();
    }
}


// Examples:
// Input: s = "geeks for geeks" 
// Output: "geeksforgeeks"
// Explanation: All spaces are removed from the string.