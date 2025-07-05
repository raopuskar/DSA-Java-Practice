import java.util.*;

class Main {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr); // Optional if input is unsorted
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == target) return true;
            else if (sum < target) low++;
            else high--;
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

        boolean result = hasPairWithSum(arr, 15);
        System.out.println("Pair with sum 15 exists: " + result);
        sc.close();
    }
}
