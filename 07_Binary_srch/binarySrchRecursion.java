import java.util.*;

class Main {
    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; // base case: target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, low, mid - 1, target); // search in left half
        } else {
            return binarySearchRecursive(arr, mid + 1, high, target); // search in right half
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = sc.nextInt();

        int result = binarySearchRecursive(arr, 0, n - 1, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close();
    }
}
