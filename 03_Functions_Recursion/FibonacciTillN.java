import java.util.Scanner;

public class FibonacciTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci sequence till term " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    // Iterative method to find nth Fibonacci number
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
