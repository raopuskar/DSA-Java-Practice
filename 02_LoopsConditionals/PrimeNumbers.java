import java.util.Scanner;

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
