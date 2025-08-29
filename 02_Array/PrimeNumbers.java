import java.util.Scanner;
//this code is to print all prime numbers from 1 to N
//A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.
//In other words, a prime number is a number that has no positive divisors other than 1 and itself.

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = input.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        input.close();
    }
}


// other best way to find prime numbers
// import java.util.Scanner;

// class Main {
//     public static boolean isPrime(int num) {
//         if (num <= 1) return false; // 0 and 1 are not prime
//         if (num == 2) return true;  // 2 is the only even prime number
//         if (num % 2 == 0) return false; // eliminate even numbers

//         // Check for factors up to the square root of num
//         for (int i = 3; i <= Math.sqrt(num); i += 2) {
//             if (num % i == 0) return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to check if it's prime: ");
//         int number = sc.nextInt();

//         if (number < 0) {
//             System.out.println("Negative numbers are not prime.");
//         } else if (isPrime(number)) {
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }

//         sc.close();
//     }
// }




//Find total number of prime numbers from 1 to N for large value of N like 10^6 or 10^7
// import java.util.*;

// class Solution {
//     public int countPrimes(int n) {
//         if (n <= 2) return 0;

//         boolean[] isPrime = new boolean[n];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = false;
//         isPrime[1] = false;

//         // mark multiples as non-prime
//         for (int i = 2; i * i < n; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j < n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (isPrime[i]) count++;
//         }

//         return count;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int n = 1000000;
//         int result = solution.countPrimes(n);
//         System.out.println(result); // Output: 78498
//     }
// }


