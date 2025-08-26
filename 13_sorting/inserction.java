class Solution {
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements one step ahead instead of swapping repeatedly
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {12, 11, 13, 5, 6};
        sol.insertionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
