class Solution {
    // Function to sort an array using quick sort algorithm.
    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Partition index
            int pi = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function that takes last element as pivot,
    // places it at correct position in sorted array,
    // and places all smaller (or equal) elements to the left
    // and all greater elements to the right
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // pivot is the last element
        int i = low - 1;       // index of smaller element

        for (int j = low; j < high; j++) {
            // if current element <= pivot, swap
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Utility function to swap
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
