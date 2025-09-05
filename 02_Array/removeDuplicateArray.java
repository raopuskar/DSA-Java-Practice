//This when the array is sorted
class Main {
    public static int removeDuplicateArray(int[] arr, int n) {
        if (n == 0 || n == 1) return n;

        int j = 0; // index for unique elements

        for (int i = 1; i < n; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // new length of array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int n = arr.length;

        int newLength = removeDuplicateArray(arr, n);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
