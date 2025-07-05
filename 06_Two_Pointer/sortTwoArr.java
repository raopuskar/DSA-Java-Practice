import java.util.*;

class SortTwoArr {
    public static void sortTwoArr(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] sort = new int[n1 + n2];

        // Merge the two arrays
        for (int i = 0; i < n1; i++) {
            sort[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            sort[n1 + i] = arr2[i];
        }

        // Sort the merged array
        Arrays.sort(sort);

        // Print the sorted array
        System.out.print("Sorted merged array: ");
        for (int val : sort) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of each array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements for first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements for second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        sortTwoArr(arr1, arr2);
    }
}
