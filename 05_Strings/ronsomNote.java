class ransomNote { //LeetCode Problem 383

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}

// Other way to solve the problem is by using HashMap


// import java.util.HashMap;
// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {

//         HashMap<Character,Integer> map = new HashMap<>();

//         for(char ch : ransomNote.toCharArray()){
//             map.put(ch, map.getOrDefault(ch,0)+1);
//         }

//         for(char ch : magazine.toCharArray()){
//             if (map.containsKey(ch)) {
//                 map.put(ch, map.get(ch) - 1);
//                 if (map.get(ch) == 0) {
//                     map.remove(ch);
//                 }
//             }
//         }

//         return map.isEmpty();
        
//     }
// }