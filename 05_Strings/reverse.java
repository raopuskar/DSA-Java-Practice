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