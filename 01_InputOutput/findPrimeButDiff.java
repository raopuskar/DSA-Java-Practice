import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Input: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && !containsZero(i)) {
                list.add(i);
            }
        }

        int count = list.size();
        System.out.print(count + " (");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
        sc.close();
    }

    //  Checks if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //  Checks if a number contains the digit 0
    public static boolean containsZero(int num) {
        while (num != 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }
}
