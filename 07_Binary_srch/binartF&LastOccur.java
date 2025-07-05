import java.util.*;

class Main {
    // First Occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;        // potential answer
                high = mid - 1;      // move to left side for earlier occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Last Occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;        // potential answer
                low = mid + 1;       // move to right side for later occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array elements (with possible duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first != -1) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        } else {
            System.out.println("Target not found in the array.");
        }

        sc.close();
    }
}
// This code finds the first and last occurrences of a target value in a sorted array.
// It uses binary search to efficiently locate the indices of the first and last occurrences.