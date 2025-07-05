import java.util.*;
class IsPrimeFunction {
    public static boolean isPrimeFunction(int n){
        boolean isPrime = true;
        for(int i=2;i <= Math.sqrt(n);i++){  //prime numbers are only divisible by 1 and themselves, so we check up to the square root of n
            if(n%i == 0){   //square root esliye check karte hai kyuki agar n kisi number se divide ho raha hai to uska pair bhi hoga, jiska ek part square root ke niche hoga
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n = sc.nextInt();
        if(isPrimeFunction(n)){
            System.out.print("Entered number is Prime");
        }else{
            System.out.print("Entered number is not Prime");
        }
        sc.close();
    }
}