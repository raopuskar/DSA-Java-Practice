class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // Handle d > n

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        System.out.print("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        rotateArr(arr, d);


    }
}


// Examples:// Input: arr = [1, 2, 3, 4, 5, 6, 7], d = 3
// Output: [4, 5, 6, 7, 1, 2, 3]
// Explanation: After rotating the array by 3 positions to the left, the new array is [ 4, 5, 6, 7, 1, 2, 3 ].
// Input: arr = [10, 20, 30, 40, 50], d = 2
// Output: [30, 40, 50, 10, 20]
// Explanation: After rotating the array by 2 positions to the left, the new array is [ 30, 40, 50, 10, 20 ].
