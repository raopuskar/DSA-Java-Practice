import java.util.*;
class longestCommonPrefix {
    public static String longestCommonPrefixx(String[] strs) {
        if(strs.length == 0) return "";
        
        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.isEmpty()) return "";
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] strs = new String[n];
        
        System.out.println("Enter the strings:");
        for(int i=0; i<n; i++) {
            strs[i] = sc.nextLine();
        }
        
        String result = longestCommonPrefixx(strs);
        System.out.println("Longest common prefix: " + result);
        sc.close();
    }
}


// Examples:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"