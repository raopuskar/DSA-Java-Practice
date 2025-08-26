class Solution {
    public int binarysearch(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int result = -1;  // to store first occurrence
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == k) {
                result = mid;      // possible answer
                high = mid - 1;    // keep searching left for first occurrence
            } 
            else if (arr[mid] < k) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int k = 2;
        int result = sol.binarysearch(arr, k);
        System.out.println("First occurrence of " + k + " is at index: " + result);
    }
}
