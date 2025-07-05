import java.util.*;

class sliding {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            System.out.println("Invalid input: Window size is larger than array size.");
            return -1;
        }

        // Step 1: Sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];    //THIS IS THE SUM OF FIRST K ELEMENTS
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {   
            windowSum += arr[i] - arr[i - k];  // Slide window by adding the next element and removing the first element of the previous window
            maxSum = Math.max(maxSum, windowSum); //compare and store the maximum sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
