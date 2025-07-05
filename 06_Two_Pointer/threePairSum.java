import java.util.*;

class Main {
    public static boolean threePairWithSum(int[] arr, int target) {
        Arrays.sort(arr); // Optional if input is unsorte
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = threePairWithSum(arr, 15);
        System.out.println("Pair with sum 15 exists: " + result);
        sc.close();
    }
}
