import java.util.*;

class isAmstrong {
    public static boolean isArmstrong(int x) {
        int original = x;
        int count = String.valueOf(x).length();  // Get number of digits
        int sum = 0;

        while (x != 0) {
            int lastNum = x % 10;
            sum += Math.pow(lastNum, count);
            x /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}

// Examples:
// Input: num = 153
// Output: "153 is an Armstrong number."
// Explanation: 1^3 + 5^3 + 3^3 = 153
