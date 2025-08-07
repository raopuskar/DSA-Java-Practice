import java.util.Scanner;
import java.util.Arrays;

class printAllDivisor {
    public static int[] divisors(int n) {
        // First pass to count number of divisors
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Second pass to fill exact-sized array
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[index++] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] divs = divisors(n);
        System.out.println("Divisors of " + n + ": " + Arrays.toString(divs));

        sc.close();
    }
}
