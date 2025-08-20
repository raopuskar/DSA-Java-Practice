import java.util.*;
class Reverse {
    // Function to reverse a string using recursion
    // Time Complexity: O(n)
    public static void reverse(String str,int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str,idx-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        reverse(str,str.length()-1);
        sc.close();
    }
}




//this using manual
// import java.util.*;
// class Solution {
//     public static String reverseString(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         int n = s.length();
        
//         for (int i = 0; i < n / 2; i++) {
//             char temp = sb.charAt(i);
//             sb.setCharAt(i, sb.charAt(n - i - 1));
//             sb.setCharAt(n - i - 1, temp);
//         }
        
//         //sb.reverse();
//         s = sb.toString();
        
//         return s;
//     }
// }