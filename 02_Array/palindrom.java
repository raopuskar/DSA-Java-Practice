import java.util.*;

class palindrom {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reverse = 0;

        while (x > 0) {
            int lastNum = x % 10;
            reverse = reverse * 10 + lastNum;
            x /= 10;
        }

        return original == reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
        sc.close();
    }
}


//example input 121
//output true
