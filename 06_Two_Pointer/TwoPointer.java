import java.util.Scanner;
class TwoPointer{
    public static int palindrom(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return 0; // Not a palindrome
            }
            left++;
            right--;
        }
        return 1; // Is a palindrome
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int result = palindrom(str);
        if(result == 1){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}