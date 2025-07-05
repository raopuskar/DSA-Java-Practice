import java.util.*;

class Main {
    public static int searchInRotatedArray(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check which half is sorted
            if (arr[low] <= arr[mid]) {
                // Left part is sorted
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Search in left
                } else {
                    low = mid + 1;  // Search in right
                }
            } else {
                // Right part is sorted
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;  // Search in right
                } else {
                    high = mid - 1; // Search in left
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int index = searchInRotatedArray(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
