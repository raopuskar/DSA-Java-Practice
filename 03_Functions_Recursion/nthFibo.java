import java.util.*;

class nthFibo {
    public static int fibonachi(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci number at position " + n + " is: " + fibonachi(n));
        sc.close();
    }
}


// Example input: 7
// Output: Fibonacci number at position 7 is: 13
